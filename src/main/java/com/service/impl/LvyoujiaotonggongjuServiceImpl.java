package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LvyoujiaotonggongjuDao;
import com.entity.LvyoujiaotonggongjuEntity;
import com.service.LvyoujiaotonggongjuService;
import com.entity.vo.LvyoujiaotonggongjuVO;
import com.entity.view.LvyoujiaotonggongjuView;

@Service("lvyoujiaotonggongjuService")
public class LvyoujiaotonggongjuServiceImpl extends ServiceImpl<LvyoujiaotonggongjuDao, LvyoujiaotonggongjuEntity> implements LvyoujiaotonggongjuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvyoujiaotonggongjuEntity> page = this.selectPage(
                new Query<LvyoujiaotonggongjuEntity>(params).getPage(),
                new EntityWrapper<LvyoujiaotonggongjuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvyoujiaotonggongjuEntity> wrapper) {
		  Page<LvyoujiaotonggongjuView> page =new Query<LvyoujiaotonggongjuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LvyoujiaotonggongjuVO> selectListVO(Wrapper<LvyoujiaotonggongjuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LvyoujiaotonggongjuVO selectVO(Wrapper<LvyoujiaotonggongjuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LvyoujiaotonggongjuView> selectListView(Wrapper<LvyoujiaotonggongjuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvyoujiaotonggongjuView selectView(Wrapper<LvyoujiaotonggongjuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
