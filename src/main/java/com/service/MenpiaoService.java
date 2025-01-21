package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MenpiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MenpiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MenpiaoView;


/**
 * 门票
 *
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface MenpiaoService extends IService<MenpiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MenpiaoVO> selectListVO(Wrapper<MenpiaoEntity> wrapper);
   	
   	MenpiaoVO selectVO(@Param("ew") Wrapper<MenpiaoEntity> wrapper);
   	
   	List<MenpiaoView> selectListView(Wrapper<MenpiaoEntity> wrapper);
   	
   	MenpiaoView selectView(@Param("ew") Wrapper<MenpiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MenpiaoEntity> wrapper);
   	

}

