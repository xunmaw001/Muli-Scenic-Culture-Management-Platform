package com.dao;

import com.entity.MenpiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MenpiaoVO;
import com.entity.view.MenpiaoView;


/**
 * 门票
 * 
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface MenpiaoDao extends BaseMapper<MenpiaoEntity> {
	
	List<MenpiaoVO> selectListVO(@Param("ew") Wrapper<MenpiaoEntity> wrapper);
	
	MenpiaoVO selectVO(@Param("ew") Wrapper<MenpiaoEntity> wrapper);
	
	List<MenpiaoView> selectListView(@Param("ew") Wrapper<MenpiaoEntity> wrapper);

	List<MenpiaoView> selectListView(Pagination page,@Param("ew") Wrapper<MenpiaoEntity> wrapper);
	
	MenpiaoView selectView(@Param("ew") Wrapper<MenpiaoEntity> wrapper);
	

}
