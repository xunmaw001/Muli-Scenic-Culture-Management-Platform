package com.dao;

import com.entity.HongheibangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HongheibangVO;
import com.entity.view.HongheibangView;


/**
 * 红黑榜
 * 
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface HongheibangDao extends BaseMapper<HongheibangEntity> {
	
	List<HongheibangVO> selectListVO(@Param("ew") Wrapper<HongheibangEntity> wrapper);
	
	HongheibangVO selectVO(@Param("ew") Wrapper<HongheibangEntity> wrapper);
	
	List<HongheibangView> selectListView(@Param("ew") Wrapper<HongheibangEntity> wrapper);

	List<HongheibangView> selectListView(Pagination page,@Param("ew") Wrapper<HongheibangEntity> wrapper);
	
	HongheibangView selectView(@Param("ew") Wrapper<HongheibangEntity> wrapper);
	

}
