package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingquView;


/**
 * 景区
 *
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface JingquService extends IService<JingquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingquVO> selectListVO(Wrapper<JingquEntity> wrapper);
   	
   	JingquVO selectVO(@Param("ew") Wrapper<JingquEntity> wrapper);
   	
   	List<JingquView> selectListView(Wrapper<JingquEntity> wrapper);
   	
   	JingquView selectView(@Param("ew") Wrapper<JingquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingquEntity> wrapper);
   	

}

