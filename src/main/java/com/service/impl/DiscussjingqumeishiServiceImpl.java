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


import com.dao.DiscussjingqumeishiDao;
import com.entity.DiscussjingqumeishiEntity;
import com.service.DiscussjingqumeishiService;
import com.entity.vo.DiscussjingqumeishiVO;
import com.entity.view.DiscussjingqumeishiView;

@Service("discussjingqumeishiService")
public class DiscussjingqumeishiServiceImpl extends ServiceImpl<DiscussjingqumeishiDao, DiscussjingqumeishiEntity> implements DiscussjingqumeishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingqumeishiEntity> page = this.selectPage(
                new Query<DiscussjingqumeishiEntity>(params).getPage(),
                new EntityWrapper<DiscussjingqumeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingqumeishiEntity> wrapper) {
		  Page<DiscussjingqumeishiView> page =new Query<DiscussjingqumeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingqumeishiVO> selectListVO(Wrapper<DiscussjingqumeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingqumeishiVO selectVO(Wrapper<DiscussjingqumeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingqumeishiView> selectListView(Wrapper<DiscussjingqumeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingqumeishiView selectView(Wrapper<DiscussjingqumeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
