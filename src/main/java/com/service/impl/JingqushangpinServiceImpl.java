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


import com.dao.JingqushangpinDao;
import com.entity.JingqushangpinEntity;
import com.service.JingqushangpinService;
import com.entity.vo.JingqushangpinVO;
import com.entity.view.JingqushangpinView;

@Service("jingqushangpinService")
public class JingqushangpinServiceImpl extends ServiceImpl<JingqushangpinDao, JingqushangpinEntity> implements JingqushangpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingqushangpinEntity> page = this.selectPage(
                new Query<JingqushangpinEntity>(params).getPage(),
                new EntityWrapper<JingqushangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingqushangpinEntity> wrapper) {
		  Page<JingqushangpinView> page =new Query<JingqushangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingqushangpinVO> selectListVO(Wrapper<JingqushangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingqushangpinVO selectVO(Wrapper<JingqushangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingqushangpinView> selectListView(Wrapper<JingqushangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingqushangpinView selectView(Wrapper<JingqushangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
