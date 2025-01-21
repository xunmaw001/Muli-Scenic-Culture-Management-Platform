package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LvyougonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LvyougonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LvyougonggaoView;


/**
 * 旅游公告
 *
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface LvyougonggaoService extends IService<LvyougonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvyougonggaoVO> selectListVO(Wrapper<LvyougonggaoEntity> wrapper);
   	
   	LvyougonggaoVO selectVO(@Param("ew") Wrapper<LvyougonggaoEntity> wrapper);
   	
   	List<LvyougonggaoView> selectListView(Wrapper<LvyougonggaoEntity> wrapper);
   	
   	LvyougonggaoView selectView(@Param("ew") Wrapper<LvyougonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvyougonggaoEntity> wrapper);
   	

}

