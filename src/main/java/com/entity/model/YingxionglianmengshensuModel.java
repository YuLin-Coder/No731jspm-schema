package com.entity.model;

import com.entity.YingxionglianmengshensuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 英雄联盟申诉
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public class YingxionglianmengshensuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 卖家姓名
	 */
	
	private String maijiaxingming;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 商品编号
	 */
	
	private String shangpinbianhao;
		
	/**
	 * 账号标题
	 */
	
	private String zhanghaobiaoti;
		
	/**
	 * 平台保障
	 */
	
	private String pingtaibaozhang;
		
	/**
	 * 实付金额
	 */
	
	private String shifujine;
		
	/**
	 * 购买日期
	 */
	
	private String goumairiqi;
		
	/**
	 * 详情截图
	 */
	
	private String xiangqingjietu;
		
	/**
	 * 申诉说明
	 */
	
	private String shensushuoming;
		
	/**
	 * 申诉时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shensushijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：卖家姓名
	 */
	 
	public void setMaijiaxingming(String maijiaxingming) {
		this.maijiaxingming = maijiaxingming;
	}
	
	/**
	 * 获取：卖家姓名
	 */
	public String getMaijiaxingming() {
		return maijiaxingming;
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
	 * 设置：商品编号
	 */
	 
	public void setShangpinbianhao(String shangpinbianhao) {
		this.shangpinbianhao = shangpinbianhao;
	}
	
	/**
	 * 获取：商品编号
	 */
	public String getShangpinbianhao() {
		return shangpinbianhao;
	}
				
	
	/**
	 * 设置：账号标题
	 */
	 
	public void setZhanghaobiaoti(String zhanghaobiaoti) {
		this.zhanghaobiaoti = zhanghaobiaoti;
	}
	
	/**
	 * 获取：账号标题
	 */
	public String getZhanghaobiaoti() {
		return zhanghaobiaoti;
	}
				
	
	/**
	 * 设置：平台保障
	 */
	 
	public void setPingtaibaozhang(String pingtaibaozhang) {
		this.pingtaibaozhang = pingtaibaozhang;
	}
	
	/**
	 * 获取：平台保障
	 */
	public String getPingtaibaozhang() {
		return pingtaibaozhang;
	}
				
	
	/**
	 * 设置：实付金额
	 */
	 
	public void setShifujine(String shifujine) {
		this.shifujine = shifujine;
	}
	
	/**
	 * 获取：实付金额
	 */
	public String getShifujine() {
		return shifujine;
	}
				
	
	/**
	 * 设置：购买日期
	 */
	 
	public void setGoumairiqi(String goumairiqi) {
		this.goumairiqi = goumairiqi;
	}
	
	/**
	 * 获取：购买日期
	 */
	public String getGoumairiqi() {
		return goumairiqi;
	}
				
	
	/**
	 * 设置：详情截图
	 */
	 
	public void setXiangqingjietu(String xiangqingjietu) {
		this.xiangqingjietu = xiangqingjietu;
	}
	
	/**
	 * 获取：详情截图
	 */
	public String getXiangqingjietu() {
		return xiangqingjietu;
	}
				
	
	/**
	 * 设置：申诉说明
	 */
	 
	public void setShensushuoming(String shensushuoming) {
		this.shensushuoming = shensushuoming;
	}
	
	/**
	 * 获取：申诉说明
	 */
	public String getShensushuoming() {
		return shensushuoming;
	}
				
	
	/**
	 * 设置：申诉时间
	 */
	 
	public void setShensushijian(Date shensushijian) {
		this.shensushijian = shensushijian;
	}
	
	/**
	 * 获取：申诉时间
	 */
	public Date getShensushijian() {
		return shensushijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
