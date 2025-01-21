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


import com.dao.MenpiaoDao;
import com.entity.MenpiaoEntity;
import com.service.MenpiaoService;
import com.entity.vo.MenpiaoVO;
import com.entity.view.MenpiaoView;

@Service("menpiaoService")
public class MenpiaoServiceImpl extends ServiceImpl<MenpiaoDao, MenpiaoEntity> implements MenpiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MenpiaoEntity> page = this.selectPage(
                new Query<MenpiaoEntity>(params).getPage(),
                new EntityWrapper<MenpiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MenpiaoEntity> wrapper) {
		  Page<MenpiaoView> page =new Query<MenpiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MenpiaoVO> selectListVO(Wrapper<MenpiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MenpiaoVO selectVO(Wrapper<MenpiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MenpiaoView> selectListView(Wrapper<MenpiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MenpiaoView selectView(Wrapper<MenpiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
