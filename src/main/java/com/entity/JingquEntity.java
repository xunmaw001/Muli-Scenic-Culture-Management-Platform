package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 景区
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-11 14:35:05
 */
@TableName("jingqu")
public class JingquEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JingquEntity() {
		
	}
	
	public JingquEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 景区名称
	 */
					
	private String jingqumingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：景区名称
	 */
	public void setJingqumingcheng(String jingqumingcheng) {
		this.jingqumingcheng = jingqumingcheng;
	}
	/**
	 * 获取：景区名称
	 */
	public String getJingqumingcheng() {
		return jingqumingcheng;
	}
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
