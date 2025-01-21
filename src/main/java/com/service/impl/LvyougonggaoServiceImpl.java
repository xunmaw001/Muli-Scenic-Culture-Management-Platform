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


import com.dao.LvyougonggaoDao;
import com.entity.LvyougonggaoEntity;
import com.service.LvyougonggaoService;
import com.entity.vo.LvyougonggaoVO;
import com.entity.view.LvyougonggaoView;

@Service("lvyougonggaoService")
public class LvyougonggaoServiceImpl extends ServiceImpl<LvyougonggaoDao, LvyougonggaoEntity> implements LvyougonggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LvyougonggaoEntity> page = this.selectPage(
                new Query<LvyougonggaoEntity>(params).getPage(),
                new EntityWrapper<LvyougonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LvyougonggaoEntity> wrapper) {
		  Page<LvyougonggaoView> page =new Query<LvyougonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LvyougonggaoVO> selectListVO(Wrapper<LvyougonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LvyougonggaoVO selectVO(Wrapper<LvyougonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LvyougonggaoView> selectListView(Wrapper<LvyougonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LvyougonggaoView selectView(Wrapper<LvyougonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
