package com.entity.view;

import com.entity.HongheibangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 红黑榜
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
@TableName("hongheibang")
public class HongheibangView  extends HongheibangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HongheibangView(){
	}
 
 	public HongheibangView(HongheibangEntity hongheibangEntity){
 	try {
			BeanUtils.copyProperties(this, hongheibangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
