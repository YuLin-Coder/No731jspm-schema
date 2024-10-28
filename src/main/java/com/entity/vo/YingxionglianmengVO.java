package com.entity.vo;

import com.entity.YingxionglianmengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 英雄联盟
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public class YingxionglianmengVO  implements Serializable {
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
	 * 网络大区
	 */
	
	private String wangluodaqu;
		
	/**
	 * 游戏区服
	 */
	
	private String youxiqufu;
		
	/**
	 * 其他
	 */
	
	private String qita;
		
	/**
	 * 限定皮肤
	 */
	
	private String xiandingpifu;
		
	/**
	 * 游戏等级
	 */
	
	private String youxidengji;
		
	/**
	 * 最高段位
	 */
	
	private String zuigaoduanwei;
		
	/**
	 * 当前段位
	 */
	
	private String dangqianduanwei;
		
	/**
	 * 英雄数量
	 */
	
	private Integer yingxiongshuliang;
		
	/**
	 * 皮肤数量
	 */
	
	private Integer pifushuliang;
		
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
	 * 设置：其他
	 */
	 
	public void setQita(String qita) {
		this.qita = qita;
	}
	
	/**
	 * 获取：其他
	 */
	public String getQita() {
		return qita;
	}
				
	
	/**
	 * 设置：限定皮肤
	 */
	 
	public void setXiandingpifu(String xiandingpifu) {
		this.xiandingpifu = xiandingpifu;
	}
	
	/**
	 * 获取：限定皮肤
	 */
	public String getXiandingpifu() {
		return xiandingpifu;
	}
				
	
	/**
	 * 设置：游戏等级
	 */
	 
	public void setYouxidengji(String youxidengji) {
		this.youxidengji = youxidengji;
	}
	
	/**
	 * 获取：游戏等级
	 */
	public String getYouxidengji() {
		return youxidengji;
	}
				
	
	/**
	 * 设置：最高段位
	 */
	 
	public void setZuigaoduanwei(String zuigaoduanwei) {
		this.zuigaoduanwei = zuigaoduanwei;
	}
	
	/**
	 * 获取：最高段位
	 */
	public String getZuigaoduanwei() {
		return zuigaoduanwei;
	}
				
	
	/**
	 * 设置：当前段位
	 */
	 
	public void setDangqianduanwei(String dangqianduanwei) {
		this.dangqianduanwei = dangqianduanwei;
	}
	
	/**
	 * 获取：当前段位
	 */
	public String getDangqianduanwei() {
		return dangqianduanwei;
	}
				
	
	/**
	 * 设置：英雄数量
	 */
	 
	public void setYingxiongshuliang(Integer yingxiongshuliang) {
		this.yingxiongshuliang = yingxiongshuliang;
	}
	
	/**
	 * 获取：英雄数量
	 */
	public Integer getYingxiongshuliang() {
		return yingxiongshuliang;
	}
				
	
	/**
	 * 设置：皮肤数量
	 */
	 
	public void setPifushuliang(Integer pifushuliang) {
		this.pifushuliang = pifushuliang;
	}
	
	/**
	 * 获取：皮肤数量
	 */
	public Integer getPifushuliang() {
		return pifushuliang;
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
