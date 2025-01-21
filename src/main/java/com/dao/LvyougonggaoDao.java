package com.dao;

import com.entity.LvyougonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LvyougonggaoVO;
import com.entity.view.LvyougonggaoView;


/**
 * 旅游公告
 * 
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface LvyougonggaoDao extends BaseMapper<LvyougonggaoEntity> {
	
	List<LvyougonggaoVO> selectListVO(@Param("ew") Wrapper<LvyougonggaoEntity> wrapper);
	
	LvyougonggaoVO selectVO(@Param("ew") Wrapper<LvyougonggaoEntity> wrapper);
	
	List<LvyougonggaoView> selectListView(@Param("ew") Wrapper<LvyougonggaoEntity> wrapper);

	List<LvyougonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<LvyougonggaoEntity> wrapper);
	
	LvyougonggaoView selectView(@Param("ew") Wrapper<LvyougonggaoEntity> wrapper);
	

}
