package com.entity.view;

import com.entity.LvyougonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 旅游公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
@TableName("lvyougonggao")
public class LvyougonggaoView  extends LvyougonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LvyougonggaoView(){
	}
 
 	public LvyougonggaoView(LvyougonggaoEntity lvyougonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, lvyougonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
