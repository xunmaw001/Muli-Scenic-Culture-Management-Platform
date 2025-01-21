package com.dao;

import com.entity.DiscusshongheibangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshongheibangVO;
import com.entity.view.DiscusshongheibangView;


/**
 * 红黑榜评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface DiscusshongheibangDao extends BaseMapper<DiscusshongheibangEntity> {
	
	List<DiscusshongheibangVO> selectListVO(@Param("ew") Wrapper<DiscusshongheibangEntity> wrapper);
	
	DiscusshongheibangVO selectVO(@Param("ew") Wrapper<DiscusshongheibangEntity> wrapper);
	
	List<DiscusshongheibangView> selectListView(@Param("ew") Wrapper<DiscusshongheibangEntity> wrapper);

	List<DiscusshongheibangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshongheibangEntity> wrapper);
	
	DiscusshongheibangView selectView(@Param("ew") Wrapper<DiscusshongheibangEntity> wrapper);
	

}
