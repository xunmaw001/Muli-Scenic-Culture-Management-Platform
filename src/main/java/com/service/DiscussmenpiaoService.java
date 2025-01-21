package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmenpiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmenpiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmenpiaoView;


/**
 * 门票评论表
 *
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface DiscussmenpiaoService extends IService<DiscussmenpiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmenpiaoVO> selectListVO(Wrapper<DiscussmenpiaoEntity> wrapper);
   	
   	DiscussmenpiaoVO selectVO(@Param("ew") Wrapper<DiscussmenpiaoEntity> wrapper);
   	
   	List<DiscussmenpiaoView> selectListView(Wrapper<DiscussmenpiaoEntity> wrapper);
   	
   	DiscussmenpiaoView selectView(@Param("ew") Wrapper<DiscussmenpiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmenpiaoEntity> wrapper);
   	

}

