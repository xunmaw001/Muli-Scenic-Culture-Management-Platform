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


import com.dao.DiscussjingquDao;
import com.entity.DiscussjingquEntity;
import com.service.DiscussjingquService;
import com.entity.vo.DiscussjingquVO;
import com.entity.view.DiscussjingquView;

@Service("discussjingquService")
public class DiscussjingquServiceImpl extends ServiceImpl<DiscussjingquDao, DiscussjingquEntity> implements DiscussjingquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingquEntity> page = this.selectPage(
                new Query<DiscussjingquEntity>(params).getPage(),
                new EntityWrapper<DiscussjingquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingquEntity> wrapper) {
		  Page<DiscussjingquView> page =new Query<DiscussjingquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingquVO> selectListVO(Wrapper<DiscussjingquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingquVO selectVO(Wrapper<DiscussjingquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingquView> selectListView(Wrapper<DiscussjingquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingquView selectView(Wrapper<DiscussjingquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
