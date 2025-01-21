package com.entity.view;

import com.entity.DiscussjingqumeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 景区美食评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
@TableName("discussjingqumeishi")
public class DiscussjingqumeishiView  extends DiscussjingqumeishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjingqumeishiView(){
	}
 
 	public DiscussjingqumeishiView(DiscussjingqumeishiEntity discussjingqumeishiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjingqumeishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
