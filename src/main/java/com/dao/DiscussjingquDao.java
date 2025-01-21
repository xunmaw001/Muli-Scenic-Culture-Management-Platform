package com.dao;

import com.entity.DiscussjingquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingquVO;
import com.entity.view.DiscussjingquView;


/**
 * 景区评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface DiscussjingquDao extends BaseMapper<DiscussjingquEntity> {
	
	List<DiscussjingquVO> selectListVO(@Param("ew") Wrapper<DiscussjingquEntity> wrapper);
	
	DiscussjingquVO selectVO(@Param("ew") Wrapper<DiscussjingquEntity> wrapper);
	
	List<DiscussjingquView> selectListView(@Param("ew") Wrapper<DiscussjingquEntity> wrapper);

	List<DiscussjingquView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingquEntity> wrapper);
	
	DiscussjingquView selectView(@Param("ew") Wrapper<DiscussjingquEntity> wrapper);
	

}
