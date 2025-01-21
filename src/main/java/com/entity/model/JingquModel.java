package com.entity.model;

import com.entity.JingquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 景区
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
public class JingquModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 景区简介
	 */
	
	private String jingqujianjie;
		
	/**
	 * 沿途商铺
	 */
	
	private String yantushangpu;
		
	/**
	 * 特色美食
	 */
	
	private String tesemeishi;
		
	/**
	 * 旅游交通工具
	 */
	
	private String lvyoujiaotonggongju;
		
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：景区简介
	 */
	 
	public void setJingqujianjie(String jingqujianjie) {
		this.jingqujianjie = jingqujianjie;
	}
	
	/**
	 * 获取：景区简介
	 */
	public String getJingqujianjie() {
		return jingqujianjie;
	}
				
	
	/**
	 * 设置：沿途商铺
	 */
	 
	public void setYantushangpu(String yantushangpu) {
		this.yantushangpu = yantushangpu;
	}
	
	/**
	 * 获取：沿途商铺
	 */
	public String getYantushangpu() {
		return yantushangpu;
	}
				
	
	/**
	 * 设置：特色美食
	 */
	 
	public void setTesemeishi(String tesemeishi) {
		this.tesemeishi = tesemeishi;
	}
	
	/**
	 * 获取：特色美食
	 */
	public String getTesemeishi() {
		return tesemeishi;
	}
				
	
	/**
	 * 设置：旅游交通工具
	 */
	 
	public void setLvyoujiaotonggongju(String lvyoujiaotonggongju) {
		this.lvyoujiaotonggongju = lvyoujiaotonggongju;
	}
	
	/**
	 * 获取：旅游交通工具
	 */
	public String getLvyoujiaotonggongju() {
		return lvyoujiaotonggongju;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
