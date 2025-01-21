package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HongheibangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HongheibangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HongheibangView;


/**
 * 红黑榜
 *
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface HongheibangService extends IService<HongheibangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HongheibangVO> selectListVO(Wrapper<HongheibangEntity> wrapper);
   	
   	HongheibangVO selectVO(@Param("ew") Wrapper<HongheibangEntity> wrapper);
   	
   	List<HongheibangView> selectListView(Wrapper<HongheibangEntity> wrapper);
   	
   	HongheibangView selectView(@Param("ew") Wrapper<HongheibangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HongheibangEntity> wrapper);
   	

}

