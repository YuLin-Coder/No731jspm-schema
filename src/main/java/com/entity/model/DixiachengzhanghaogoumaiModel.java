package com.entity.model;

import com.entity.DixiachengzhanghaogoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 地下城账号购买
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public class DixiachengzhanghaogoumaiModel  implements Serializable {
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
	 * 游戏区服
	 */
	
	private String youxiqufu;
		
	/**
	 * 游戏跨区
	 */
	
	private String youxikuaqu;
		
	/**
	 * 角色等级
	 */
	
	private String jiaosedengji;
		
	/**
	 * 角色职业
	 */
	
	private String jiaosezhiye;
		
	/**
	 * 账号价格
	 */
	
	private String zhanghaojiage;
		
	/**
	 * 手续费
	 */
	
	private String shouxufei;
		
	/**
	 * 平台保障
	 */
	
	private String pingtaibaozhang;
		
	/**
	 * 实付金额
	 */
	
	private String shifujine;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 购买日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goumairiqi;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：游戏跨区
	 */
	 
	public void setYouxikuaqu(String youxikuaqu) {
		this.youxikuaqu = youxikuaqu;
	}
	
	/**
	 * 获取：游戏跨区
	 */
	public String getYouxikuaqu() {
		return youxikuaqu;
	}
				
	
	/**
	 * 设置：角色等级
	 */
	 
	public void setJiaosedengji(String jiaosedengji) {
		this.jiaosedengji = jiaosedengji;
	}
	
	/**
	 * 获取：角色等级
	 */
	public String getJiaosedengji() {
		return jiaosedengji;
	}
				
	
	/**
	 * 设置：角色职业
	 */
	 
	public void setJiaosezhiye(String jiaosezhiye) {
		this.jiaosezhiye = jiaosezhiye;
	}
	
	/**
	 * 获取：角色职业
	 */
	public String getJiaosezhiye() {
		return jiaosezhiye;
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
	 * 设置：手续费
	 */
	 
	public void setShouxufei(String shouxufei) {
		this.shouxufei = shouxufei;
	}
	
	/**
	 * 获取：手续费
	 */
	public String getShouxufei() {
		return shouxufei;
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
	 * 设置：购买日期
	 */
	 
	public void setGoumairiqi(Date goumairiqi) {
		this.goumairiqi = goumairiqi;
	}
	
	/**
	 * 获取：购买日期
	 */
	public Date getGoumairiqi() {
		return goumairiqi;
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
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
