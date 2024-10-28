package com.entity.model;

import com.entity.DixiachengyuyongshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 地下城与勇士
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public class DixiachengyuyongshiModel  implements Serializable {
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
	 * 角色性别
	 */
	
	private String jiaosexingbie;
		
	/**
	 * 封号记录
	 */
	
	private String fenghaojilu;
		
	/**
	 * qq等级
	 */
	
	private String qqdengji;
		
	/**
	 * qq好友
	 */
	
	private String qqhaoyou;
		
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
		
	/**
	 * 账号价格
	 */
	
	private Integer zhanghaojiage;
		
	/**
	 * 价格区间
	 */
	
	private String jiagequjian;
		
	/**
	 * 手续费
	 */
	
	private String shouxufei;
		
	/**
	 * 平台保障
	 */
	
	private String pingtaibaozhang;
		
	/**
	 * 账号简介
	 */
	
	private String zhanghaojianjie;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 账号详情
	 */
	
	private String zhanghaoxiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
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
	 * 设置：角色性别
	 */
	 
	public void setJiaosexingbie(String jiaosexingbie) {
		this.jiaosexingbie = jiaosexingbie;
	}
	
	/**
	 * 获取：角色性别
	 */
	public String getJiaosexingbie() {
		return jiaosexingbie;
	}
				
	
	/**
	 * 设置：封号记录
	 */
	 
	public void setFenghaojilu(String fenghaojilu) {
		this.fenghaojilu = fenghaojilu;
	}
	
	/**
	 * 获取：封号记录
	 */
	public String getFenghaojilu() {
		return fenghaojilu;
	}
				
	
	/**
	 * 设置：qq等级
	 */
	 
	public void setQqdengji(String qqdengji) {
		this.qqdengji = qqdengji;
	}
	
	/**
	 * 获取：qq等级
	 */
	public String getQqdengji() {
		return qqdengji;
	}
				
	
	/**
	 * 设置：qq好友
	 */
	 
	public void setQqhaoyou(String qqhaoyou) {
		this.qqhaoyou = qqhaoyou;
	}
	
	/**
	 * 获取：qq好友
	 */
	public String getQqhaoyou() {
		return qqhaoyou;
	}
				
	
	/**
	 * 设置：封面图片
	 */
	 
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
				
	
	/**
	 * 设置：账号价格
	 */
	 
	public void setZhanghaojiage(Integer zhanghaojiage) {
		this.zhanghaojiage = zhanghaojiage;
	}
	
	/**
	 * 获取：账号价格
	 */
	public Integer getZhanghaojiage() {
		return zhanghaojiage;
	}
				
	
	/**
	 * 设置：价格区间
	 */
	 
	public void setJiagequjian(String jiagequjian) {
		this.jiagequjian = jiagequjian;
	}
	
	/**
	 * 获取：价格区间
	 */
	public String getJiagequjian() {
		return jiagequjian;
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
	 * 设置：账号简介
	 */
	 
	public void setZhanghaojianjie(String zhanghaojianjie) {
		this.zhanghaojianjie = zhanghaojianjie;
	}
	
	/**
	 * 获取：账号简介
	 */
	public String getZhanghaojianjie() {
		return zhanghaojianjie;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：账号详情
	 */
	 
	public void setZhanghaoxiangqing(String zhanghaoxiangqing) {
		this.zhanghaoxiangqing = zhanghaoxiangqing;
	}
	
	/**
	 * 获取：账号详情
	 */
	public String getZhanghaoxiangqing() {
		return zhanghaoxiangqing;
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
