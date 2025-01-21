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


import com.dao.DiscusshongheibangDao;
import com.entity.DiscusshongheibangEntity;
import com.service.DiscusshongheibangService;
import com.entity.vo.DiscusshongheibangVO;
import com.entity.view.DiscusshongheibangView;

@Service("discusshongheibangService")
public class DiscusshongheibangServiceImpl extends ServiceImpl<DiscusshongheibangDao, DiscusshongheibangEntity> implements DiscusshongheibangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshongheibangEntity> page = this.selectPage(
                new Query<DiscusshongheibangEntity>(params).getPage(),
                new EntityWrapper<DiscusshongheibangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshongheibangEntity> wrapper) {
		  Page<DiscusshongheibangView> page =new Query<DiscusshongheibangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshongheibangVO> selectListVO(Wrapper<DiscusshongheibangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshongheibangVO selectVO(Wrapper<DiscusshongheibangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshongheibangView> selectListView(Wrapper<DiscusshongheibangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshongheibangView selectView(Wrapper<DiscusshongheibangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
