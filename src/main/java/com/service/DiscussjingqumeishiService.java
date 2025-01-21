package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingqumeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingqumeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingqumeishiView;


/**
 * 景区美食评论表
 *
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface DiscussjingqumeishiService extends IService<DiscussjingqumeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingqumeishiVO> selectListVO(Wrapper<DiscussjingqumeishiEntity> wrapper);
   	
   	DiscussjingqumeishiVO selectVO(@Param("ew") Wrapper<DiscussjingqumeishiEntity> wrapper);
   	
   	List<DiscussjingqumeishiView> selectListView(Wrapper<DiscussjingqumeishiEntity> wrapper);
   	
   	DiscussjingqumeishiView selectView(@Param("ew") Wrapper<DiscussjingqumeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingqumeishiEntity> wrapper);
   	

}

