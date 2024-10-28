package com.entity.vo;

import com.entity.SixinliaotianjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 私信聊天记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public class SixinliaotianjiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 卖家姓名
	 */
	
	private String maijiaxingming;
		
	/**
	 * 商品编号
	 */
	
	private String shangpinbianhao;
		
	/**
	 * 账号标题
	 */
	
	private String zhanghaobiaoti;
		
	/**
	 * 游戏分类
	 */
	
	private String youxifenlei;
		
	/**
	 * 账号价格
	 */
	
	private String zhanghaojiage;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 私信内容
	 */
	
	private String sixinneirong;
		
	/**
	 * 私信时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date sixinshijian;
				
	
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
	 * 设置：游戏分类
	 */
	 
	public void setYouxifenlei(String youxifenlei) {
		this.youxifenlei = youxifenlei;
	}
	
	/**
	 * 获取：游戏分类
	 */
	public String getYouxifenlei() {
		return youxifenlei;
	}
				
	
	/**
	 * 设置：账号价格
	 */
	 
	public void setZhanghaojiage(String zhanghaojiage) {
		this.zhanghaojiage = zhanghaojiage;
	}
	
	/**
	 * 获取：账号价格
	 */
	public String getZhanghaojiage() {
		return zhanghaojiage;
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
	 * 设置：私信内容
	 */
	 
	public void setSixinneirong(String sixinneirong) {
		this.sixinneirong = sixinneirong;
	}
	
	/**
	 * 获取：私信内容
	 */
	public String getSixinneirong() {
		return sixinneirong;
	}
				
	
	/**
	 * 设置：私信时间
	 */
	 
	public void setSixinshijian(Date sixinshijian) {
		this.sixinshijian = sixinshijian;
	}
	
	/**
	 * 获取：私信时间
	 */
	public Date getSixinshijian() {
		return sixinshijian;
	}
			
}
