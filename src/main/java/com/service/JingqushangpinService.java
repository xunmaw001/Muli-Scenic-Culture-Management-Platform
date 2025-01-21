package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingqushangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingqushangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingqushangpinView;


/**
 * 景区商品
 *
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface JingqushangpinService extends IService<JingqushangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingqushangpinVO> selectListVO(Wrapper<JingqushangpinEntity> wrapper);
   	
   	JingqushangpinVO selectVO(@Param("ew") Wrapper<JingqushangpinEntity> wrapper);
   	
   	List<JingqushangpinView> selectListView(Wrapper<JingqushangpinEntity> wrapper);
   	
   	JingqushangpinView selectView(@Param("ew") Wrapper<JingqushangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingqushangpinEntity> wrapper);
   	

}

