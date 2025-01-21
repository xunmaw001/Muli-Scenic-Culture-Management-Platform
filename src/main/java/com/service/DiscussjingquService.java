package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingquView;


/**
 * 景区评论表
 *
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface DiscussjingquService extends IService<DiscussjingquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingquVO> selectListVO(Wrapper<DiscussjingquEntity> wrapper);
   	
   	DiscussjingquVO selectVO(@Param("ew") Wrapper<DiscussjingquEntity> wrapper);
   	
   	List<DiscussjingquView> selectListView(Wrapper<DiscussjingquEntity> wrapper);
   	
   	DiscussjingquView selectView(@Param("ew") Wrapper<DiscussjingquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingquEntity> wrapper);
   	

}

