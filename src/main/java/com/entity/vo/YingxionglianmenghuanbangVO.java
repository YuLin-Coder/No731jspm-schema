package com.entity.vo;

import com.entity.YingxionglianmenghuanbangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 英雄联盟换绑
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public class YingxionglianmenghuanbangVO  implements Serializable {
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
	 * 网络大区
	 */
	
	private String wangluodaqu;
		
	/**
	 * 游戏区服
	 */
	
	private String youxiqufu;
		
	/**
	 * 登录账号
	 */
	
	private Integer dengluzhanghao;
		
	/**
	 * 登录密码
	 */
	
	private String denglumima;
		
	/**
	 * 绑定手机
	 */
	
	private String bangdingshouji;
		
	/**
	 * 换绑手机
	 */
	
	private String huanbangshouji;
		
	/**
	 * 换绑截图
	 */
	
	private String huanbangjietu;
		
	/**
	 * 换绑时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huanbangshijian;
		
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
	 * 设置：网络大区
	 */
	 
	public void setWangluodaqu(String wangluodaqu) {
		this.wangluodaqu = wangluodaqu;
	}
	
	/**
	 * 获取：网络大区
	 */
	public String getWangluodaqu() {
		return wangluodaqu;
	}
				
	
	/**
	 * 设置：游戏区服
	 */
	 
	public void setYouxiqufu(String youxiqufu) {
		this.youxiqufu = youxiqufu;
	}
	
	/**
	 * 获取：游戏区服
	 */
	public String getYouxiqufu() {
		return youxiqufu;
	}
				
	
	/**
	 * 设置：登录账号
	 */
	 
	public void setDengluzhanghao(Integer dengluzhanghao) {
		this.dengluzhanghao = dengluzhanghao;
	}
	
	/**
	 * 获取：登录账号
	 */
	public Integer getDengluzhanghao() {
		return dengluzhanghao;
	}
				
	
	/**
	 * 设置：登录密码
	 */
	 
	public void setDenglumima(String denglumima) {
		this.denglumima = denglumima;
	}
	
	/**
	 * 获取：登录密码
	 */
	public String getDenglumima() {
		return denglumima;
	}
				
	
	/**
	 * 设置：绑定手机
	 */
	 
	public void setBangdingshouji(String bangdingshouji) {
		this.bangdingshouji = bangdingshouji;
	}
	
	/**
	 * 获取：绑定手机
	 */
	public String getBangdingshouji() {
		return bangdingshouji;
	}
				
	
	/**
	 * 设置：换绑手机
	 */
	 
	public void setHuanbangshouji(String huanbangshouji) {
		this.huanbangshouji = huanbangshouji;
	}
	
	/**
	 * 获取：换绑手机
	 */
	public String getHuanbangshouji() {
		return huanbangshouji;
	}
				
	
	/**
	 * 设置：换绑截图
	 */
	 
	public void setHuanbangjietu(String huanbangjietu) {
		this.huanbangjietu = huanbangjietu;
	}
	
	/**
	 * 获取：换绑截图
	 */
	public String getHuanbangjietu() {
		return huanbangjietu;
	}
				
	
	/**
	 * 设置：换绑时间
	 */
	 
	public void setHuanbangshijian(Date huanbangshijian) {
		this.huanbangshijian = huanbangshijian;
	}
	
	/**
	 * 获取：换绑时间
	 */
	public Date getHuanbangshijian() {
		return huanbangshijian;
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
