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


import com.dao.JingqumeishiDao;
import com.entity.JingqumeishiEntity;
import com.service.JingqumeishiService;
import com.entity.vo.JingqumeishiVO;
import com.entity.view.JingqumeishiView;

@Service("jingqumeishiService")
public class JingqumeishiServiceImpl extends ServiceImpl<JingqumeishiDao, JingqumeishiEntity> implements JingqumeishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingqumeishiEntity> page = this.selectPage(
                new Query<JingqumeishiEntity>(params).getPage(),
                new EntityWrapper<JingqumeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingqumeishiEntity> wrapper) {
		  Page<JingqumeishiView> page =new Query<JingqumeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingqumeishiVO> selectListVO(Wrapper<JingqumeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingqumeishiVO selectVO(Wrapper<JingqumeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingqumeishiView> selectListView(Wrapper<JingqumeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingqumeishiView selectView(Wrapper<JingqumeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
