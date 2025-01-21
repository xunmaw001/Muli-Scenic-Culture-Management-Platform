package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingqumeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingqumeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingqumeishiView;


/**
 * 景区美食
 *
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface JingqumeishiService extends IService<JingqumeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingqumeishiVO> selectListVO(Wrapper<JingqumeishiEntity> wrapper);
   	
   	JingqumeishiVO selectVO(@Param("ew") Wrapper<JingqumeishiEntity> wrapper);
   	
   	List<JingqumeishiView> selectListView(Wrapper<JingqumeishiEntity> wrapper);
   	
   	JingqumeishiView selectView(@Param("ew") Wrapper<JingqumeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingqumeishiEntity> wrapper);
   	

}

