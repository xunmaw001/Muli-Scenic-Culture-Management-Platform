package com.entity.view;

import com.entity.JingquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 景区
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
@TableName("jingqu")
public class JingquView  extends JingquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingquView(){
	}
 
 	public JingquView(JingquEntity jingquEntity){
 	try {
			BeanUtils.copyProperties(this, jingquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
