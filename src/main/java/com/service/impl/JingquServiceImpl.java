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


import com.dao.JingquDao;
import com.entity.JingquEntity;
import com.service.JingquService;
import com.entity.vo.JingquVO;
import com.entity.view.JingquView;

@Service("jingquService")
public class JingquServiceImpl extends ServiceImpl<JingquDao, JingquEntity> implements JingquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingquEntity> page = this.selectPage(
                new Query<JingquEntity>(params).getPage(),
                new EntityWrapper<JingquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingquEntity> wrapper) {
		  Page<JingquView> page =new Query<JingquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingquVO> selectListVO(Wrapper<JingquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingquVO selectVO(Wrapper<JingquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingquView> selectListView(Wrapper<JingquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingquView selectView(Wrapper<JingquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
