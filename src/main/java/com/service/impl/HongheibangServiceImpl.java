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


import com.dao.HongheibangDao;
import com.entity.HongheibangEntity;
import com.service.HongheibangService;
import com.entity.vo.HongheibangVO;
import com.entity.view.HongheibangView;

@Service("hongheibangService")
public class HongheibangServiceImpl extends ServiceImpl<HongheibangDao, HongheibangEntity> implements HongheibangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HongheibangEntity> page = this.selectPage(
                new Query<HongheibangEntity>(params).getPage(),
                new EntityWrapper<HongheibangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HongheibangEntity> wrapper) {
		  Page<HongheibangView> page =new Query<HongheibangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HongheibangVO> selectListVO(Wrapper<HongheibangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HongheibangVO selectVO(Wrapper<HongheibangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HongheibangView> selectListView(Wrapper<HongheibangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HongheibangView selectView(Wrapper<HongheibangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
