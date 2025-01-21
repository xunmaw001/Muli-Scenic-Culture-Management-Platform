package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshongheibangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshongheibangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshongheibangView;


/**
 * 红黑榜评论表
 *
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface DiscusshongheibangService extends IService<DiscusshongheibangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshongheibangVO> selectListVO(Wrapper<DiscusshongheibangEntity> wrapper);
   	
   	DiscusshongheibangVO selectVO(@Param("ew") Wrapper<DiscusshongheibangEntity> wrapper);
   	
   	List<DiscusshongheibangView> selectListView(Wrapper<DiscusshongheibangEntity> wrapper);
   	
   	DiscusshongheibangView selectView(@Param("ew") Wrapper<DiscusshongheibangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshongheibangEntity> wrapper);
   	

}

