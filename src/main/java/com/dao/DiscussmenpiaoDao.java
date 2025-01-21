package com.dao;

import com.entity.DiscussmenpiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmenpiaoVO;
import com.entity.view.DiscussmenpiaoView;


/**
 * 门票评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface DiscussmenpiaoDao extends BaseMapper<DiscussmenpiaoEntity> {
	
	List<DiscussmenpiaoVO> selectListVO(@Param("ew") Wrapper<DiscussmenpiaoEntity> wrapper);
	
	DiscussmenpiaoVO selectVO(@Param("ew") Wrapper<DiscussmenpiaoEntity> wrapper);
	
	List<DiscussmenpiaoView> selectListView(@Param("ew") Wrapper<DiscussmenpiaoEntity> wrapper);

	List<DiscussmenpiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmenpiaoEntity> wrapper);
	
	DiscussmenpiaoView selectView(@Param("ew") Wrapper<DiscussmenpiaoEntity> wrapper);
	

}
