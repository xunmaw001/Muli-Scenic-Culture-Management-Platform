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

import com.entity.JingqumeishiEntity;
import com.entity.view.JingqumeishiView;

import com.service.JingqumeishiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 景区美食
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
@RestController
@RequestMapping("/jingqumeishi")
public class JingqumeishiController {
    @Autowired
    private JingqumeishiService jingqumeishiService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JingqumeishiEntity jingqumeishi, 
		HttpServletRequest request){

        EntityWrapper<JingqumeishiEntity> ew = new EntityWrapper<JingqumeishiEntity>();
		PageUtils page = jingqumeishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingqumeishi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JingqumeishiEntity jingqumeishi, 
		HttpServletRequest request){
        EntityWrapper<JingqumeishiEntity> ew = new EntityWrapper<JingqumeishiEntity>();
		PageUtils page = jingqumeishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jingqumeishi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JingqumeishiEntity jingqumeishi){
       	EntityWrapper<JingqumeishiEntity> ew = new EntityWrapper<JingqumeishiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jingqumeishi, "jingqumeishi")); 
        return R.ok().put("data", jingqumeishiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JingqumeishiEntity jingqumeishi){
        EntityWrapper< JingqumeishiEntity> ew = new EntityWrapper< JingqumeishiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jingqumeishi, "jingqumeishi")); 
		JingqumeishiView jingqumeishiView =  jingqumeishiService.selectView(ew);
		return R.ok("查询景区美食成功").put("data", jingqumeishiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JingqumeishiEntity jingqumeishi = jingqumeishiService.selectById(id);
        return R.ok().put("data", jingqumeishi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JingqumeishiEntity jingqumeishi = jingqumeishiService.selectById(id);
        return R.ok().put("data", jingqumeishi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        JingqumeishiEntity jingqumeishi = jingqumeishiService.selectById(id);
        if(type.equals("1")) {
        	jingqumeishi.setThumbsupnum(jingqumeishi.getThumbsupnum()+1);
        } else {
        	jingqumeishi.setCrazilynum(jingqumeishi.getCrazilynum()+1);
        }
        jingqumeishiService.updateById(jingqumeishi);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JingqumeishiEntity jingqumeishi, HttpServletRequest request){
    	jingqumeishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingqumeishi);

        jingqumeishiService.insert(jingqumeishi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody JingqumeishiEntity jingqumeishi, HttpServletRequest request){
    	jingqumeishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jingqumeishi);

        jingqumeishiService.insert(jingqumeishi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody JingqumeishiEntity jingqumeishi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jingqumeishi);
        jingqumeishiService.updateById(jingqumeishi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jingqumeishiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JingqumeishiEntity> wrapper = new EntityWrapper<JingqumeishiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = jingqumeishiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
