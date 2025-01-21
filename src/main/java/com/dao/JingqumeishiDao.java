package com.dao;

import com.entity.JingqumeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingqumeishiVO;
import com.entity.view.JingqumeishiView;


/**
 * 景区美食
 * 
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface JingqumeishiDao extends BaseMapper<JingqumeishiEntity> {
	
	List<JingqumeishiVO> selectListVO(@Param("ew") Wrapper<JingqumeishiEntity> wrapper);
	
	JingqumeishiVO selectVO(@Param("ew") Wrapper<JingqumeishiEntity> wrapper);
	
	List<JingqumeishiView> selectListView(@Param("ew") Wrapper<JingqumeishiEntity> wrapper);

	List<JingqumeishiView> selectListView(Pagination page,@Param("ew") Wrapper<JingqumeishiEntity> wrapper);
	
	JingqumeishiView selectView(@Param("ew") Wrapper<JingqumeishiEntity> wrapper);
	

}
