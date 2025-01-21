package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HongheibangEntity;
import com.entity.view.HongheibangView;

import com.service.HongheibangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 红黑榜
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
@RestController
@RequestMapping("/hongheibang")
public class HongheibangController {
    @Autowired
    private HongheibangService hongheibangService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HongheibangEntity hongheibang, 
		HttpServletRequest request){

        EntityWrapper<HongheibangEntity> ew = new EntityWrapper<HongheibangEntity>();
		PageUtils page = hongheibangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hongheibang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HongheibangEntity hongheibang, 
		HttpServletRequest request){
        EntityWrapper<HongheibangEntity> ew = new EntityWrapper<HongheibangEntity>();
		PageUtils page = hongheibangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hongheibang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HongheibangEntity hongheibang){
       	EntityWrapper<HongheibangEntity> ew = new EntityWrapper<HongheibangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( hongheibang, "hongheibang")); 
        return R.ok().put("data", hongheibangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HongheibangEntity hongheibang){
        EntityWrapper< HongheibangEntity> ew = new EntityWrapper< HongheibangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( hongheibang, "hongheibang")); 
		HongheibangView hongheibangView =  hongheibangService.selectView(ew);
		return R.ok("查询红黑榜成功").put("data", hongheibangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HongheibangEntity hongheibang = hongheibangService.selectById(id);
        return R.ok().put("data", hongheibang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HongheibangEntity hongheibang = hongheibangService.selectById(id);
        return R.ok().put("data", hongheibang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HongheibangEntity hongheibang, HttpServletRequest request){
    	hongheibang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hongheibang);

        hongheibangService.insert(hongheibang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody HongheibangEntity hongheibang, HttpServletRequest request){
    	hongheibang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hongheibang);

        hongheibangService.insert(hongheibang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HongheibangEntity hongheibang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(hongheibang);
        hongheibangService.updateById(hongheibang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        hongheibangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<HongheibangEntity> wrapper = new EntityWrapper<HongheibangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = hongheibangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
