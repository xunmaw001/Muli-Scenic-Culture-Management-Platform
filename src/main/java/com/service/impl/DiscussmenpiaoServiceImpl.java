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


import com.dao.DiscussmenpiaoDao;
import com.entity.DiscussmenpiaoEntity;
import com.service.DiscussmenpiaoService;
import com.entity.vo.DiscussmenpiaoVO;
import com.entity.view.DiscussmenpiaoView;

@Service("discussmenpiaoService")
public class DiscussmenpiaoServiceImpl extends ServiceImpl<DiscussmenpiaoDao, DiscussmenpiaoEntity> implements DiscussmenpiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmenpiaoEntity> page = this.selectPage(
                new Query<DiscussmenpiaoEntity>(params).getPage(),
                new EntityWrapper<DiscussmenpiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmenpiaoEntity> wrapper) {
		  Page<DiscussmenpiaoView> page =new Query<DiscussmenpiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmenpiaoVO> selectListVO(Wrapper<DiscussmenpiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmenpiaoVO selectVO(Wrapper<DiscussmenpiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmenpiaoView> selectListView(Wrapper<DiscussmenpiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmenpiaoView selectView(Wrapper<DiscussmenpiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
