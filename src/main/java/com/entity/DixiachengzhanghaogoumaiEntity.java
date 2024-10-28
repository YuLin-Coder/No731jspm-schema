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
 * 地下城账号购买
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
@TableName("dixiachengzhanghaogoumai")
public class DixiachengzhanghaogoumaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DixiachengzhanghaogoumaiEntity() {
		
	}
	
	public DixiachengzhanghaogoumaiEntity(T t) {
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
	 * 卖家账号
	 */
					
	private String maijiazhanghao;
	
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
	 * 设置：卖家账号
	 */
	public void setMaijiazhanghao(String maijiazhanghao) {
		this.maijiazhanghao = maijiazhanghao;
	}
	/**
	 * 获取：卖家账号
	 */
	public String getMaijiazhanghao() {
		return maijiazhanghao;
	}
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
