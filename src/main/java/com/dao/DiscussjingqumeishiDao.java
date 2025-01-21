package com.dao;

import com.entity.DiscussjingqumeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingqumeishiVO;
import com.entity.view.DiscussjingqumeishiView;


/**
 * 景区美食评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface DiscussjingqumeishiDao extends BaseMapper<DiscussjingqumeishiEntity> {
	
	List<DiscussjingqumeishiVO> selectListVO(@Param("ew") Wrapper<DiscussjingqumeishiEntity> wrapper);
	
	DiscussjingqumeishiVO selectVO(@Param("ew") Wrapper<DiscussjingqumeishiEntity> wrapper);
	
	List<DiscussjingqumeishiView> selectListView(@Param("ew") Wrapper<DiscussjingqumeishiEntity> wrapper);

	List<DiscussjingqumeishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingqumeishiEntity> wrapper);
	
	DiscussjingqumeishiView selectView(@Param("ew") Wrapper<DiscussjingqumeishiEntity> wrapper);
	

}
