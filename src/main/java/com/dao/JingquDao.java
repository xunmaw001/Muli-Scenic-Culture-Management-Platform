package com.dao;

import com.entity.JingquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingquVO;
import com.entity.view.JingquView;


/**
 * 景区
 * 
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface JingquDao extends BaseMapper<JingquEntity> {
	
	List<JingquVO> selectListVO(@Param("ew") Wrapper<JingquEntity> wrapper);
	
	JingquVO selectVO(@Param("ew") Wrapper<JingquEntity> wrapper);
	
	List<JingquView> selectListView(@Param("ew") Wrapper<JingquEntity> wrapper);

	List<JingquView> selectListView(Pagination page,@Param("ew") Wrapper<JingquEntity> wrapper);
	
	JingquView selectView(@Param("ew") Wrapper<JingquEntity> wrapper);
	

}
