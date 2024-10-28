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
 * 用户
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:13
 */
@TableName("yonghu")
public class YonghuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonghuEntity() {
		
	}
	
	public YonghuEntity(T t) {
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
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 出生年月
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chushengnianyue;
	
	/**
	 * qq账号
	 */
					
	private Integer qqzhanghao;
	
	/**
	 * 电话号码
	 */
					
	private String dianhuahaoma;
	
	/**
	 * 邮箱号码
	 */
					
	private String youxianghaoma;
	
	/**
	 * 身份证号
	 */
					
	private String shenfenzhenghao;
	
	/**
	 * 家庭地址
	 */
					
	private String jiatingdizhi;
	
	/**
	 * 个人照片
	 */
					
	private String gerenzhaopian;
	
	
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
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
	/**
	 * 设置：出生年月
	 */
	public void setChushengnianyue(Date chushengnianyue) {
		this.chushengnianyue = chushengnianyue;
	}
	/**
	 * 获取：出生年月
	 */
	public Date getChushengnianyue() {
		return chushengnianyue;
	}
	/**
	 * 设置：qq账号
	 */
	public void setQqzhanghao(Integer qqzhanghao) {
		this.qqzhanghao = qqzhanghao;
	}
	/**
	 * 获取：qq账号
	 */
	public Integer getQqzhanghao() {
		return qqzhanghao;
	}
	/**
	 * 设置：电话号码
	 */
	public void setDianhuahaoma(String dianhuahaoma) {
		this.dianhuahaoma = dianhuahaoma;
	}
	/**
	 * 获取：电话号码
	 */
	public String getDianhuahaoma() {
		return dianhuahaoma;
	}
	/**
	 * 设置：邮箱号码
	 */
	public void setYouxianghaoma(String youxianghaoma) {
		this.youxianghaoma = youxianghaoma;
	}
	/**
	 * 获取：邮箱号码
	 */
	public String getYouxianghaoma() {
		return youxianghaoma;
	}
	/**
	 * 设置：身份证号
	 */
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
	}
	/**
	 * 设置：家庭地址
	 */
	public void setJiatingdizhi(String jiatingdizhi) {
		this.jiatingdizhi = jiatingdizhi;
	}
	/**
	 * 获取：家庭地址
	 */
	public String getJiatingdizhi() {
		return jiatingdizhi;
	}
	/**
	 * 设置：个人照片
	 */
	public void setGerenzhaopian(String gerenzhaopian) {
		this.gerenzhaopian = gerenzhaopian;
	}
	/**
	 * 获取：个人照片
	 */
	public String getGerenzhaopian() {
		return gerenzhaopian;
	}

}
