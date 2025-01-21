package com.entity.view;

import com.entity.MenpiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 门票
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
@TableName("menpiao")
public class MenpiaoView  extends MenpiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MenpiaoView(){
	}
 
 	public MenpiaoView(MenpiaoEntity menpiaoEntity){
 	try {
			BeanUtils.copyProperties(this, menpiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
