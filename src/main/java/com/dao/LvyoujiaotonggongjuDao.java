package com.dao;

import com.entity.LvyoujiaotonggongjuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LvyoujiaotonggongjuVO;
import com.entity.view.LvyoujiaotonggongjuView;


/**
 * 旅游交通工具
 * 
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface LvyoujiaotonggongjuDao extends BaseMapper<LvyoujiaotonggongjuEntity> {
	
	List<LvyoujiaotonggongjuVO> selectListVO(@Param("ew") Wrapper<LvyoujiaotonggongjuEntity> wrapper);
	
	LvyoujiaotonggongjuVO selectVO(@Param("ew") Wrapper<LvyoujiaotonggongjuEntity> wrapper);
	
	List<LvyoujiaotonggongjuView> selectListView(@Param("ew") Wrapper<LvyoujiaotonggongjuEntity> wrapper);

	List<LvyoujiaotonggongjuView> selectListView(Pagination page,@Param("ew") Wrapper<LvyoujiaotonggongjuEntity> wrapper);
	
	LvyoujiaotonggongjuView selectView(@Param("ew") Wrapper<LvyoujiaotonggongjuEntity> wrapper);
	

}
