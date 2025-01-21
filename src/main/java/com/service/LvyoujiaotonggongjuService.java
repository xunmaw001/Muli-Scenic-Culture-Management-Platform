package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LvyoujiaotonggongjuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LvyoujiaotonggongjuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LvyoujiaotonggongjuView;


/**
 * 旅游交通工具
 *
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public interface LvyoujiaotonggongjuService extends IService<LvyoujiaotonggongjuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LvyoujiaotonggongjuVO> selectListVO(Wrapper<LvyoujiaotonggongjuEntity> wrapper);
   	
   	LvyoujiaotonggongjuVO selectVO(@Param("ew") Wrapper<LvyoujiaotonggongjuEntity> wrapper);
   	
   	List<LvyoujiaotonggongjuView> selectListView(Wrapper<LvyoujiaotonggongjuEntity> wrapper);
   	
   	LvyoujiaotonggongjuView selectView(@Param("ew") Wrapper<LvyoujiaotonggongjuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LvyoujiaotonggongjuEntity> wrapper);
   	

}

