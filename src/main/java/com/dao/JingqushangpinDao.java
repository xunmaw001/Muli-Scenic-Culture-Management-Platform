package com.dao;

import com.entity.JingqushangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingqushangpinVO;
import com.entity.view.JingqushangpinView;


/**
 * 景区商品
 * 
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface JingqushangpinDao extends BaseMapper<JingqushangpinEntity> {
	
	List<JingqushangpinVO> selectListVO(@Param("ew") Wrapper<JingqushangpinEntity> wrapper);
	
	JingqushangpinVO selectVO(@Param("ew") Wrapper<JingqushangpinEntity> wrapper);
	
	List<JingqushangpinView> selectListView(@Param("ew") Wrapper<JingqushangpinEntity> wrapper);

	List<JingqushangpinView> selectListView(Pagination page,@Param("ew") Wrapper<JingqushangpinEntity> wrapper);
	
	JingqushangpinView selectView(@Param("ew") Wrapper<JingqushangpinEntity> wrapper);
	

}
