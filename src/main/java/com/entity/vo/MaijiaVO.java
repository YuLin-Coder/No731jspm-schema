package com.entity.vo;

import com.entity.MaijiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 卖家
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:13
 */
public class MaijiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 卖家姓名
	 */
	
	private String maijiaxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 出生年月
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chushengnianyue;
		
	/**
	 * qq账号
	 */
	
	private Integer qqzhanghao;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 电子邮箱
	 */
	
	private String dianziyouxiang;
		
	/**
	 * 身份证号
	 */
	
	private String shenfenzhenghao;
		
	/**
	 * 家庭地址
	 */
	
	private String jiatingdizhi;
		
	/**
	 * 认证照片
	 */
	
	private String renzhengzhaopian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
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
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：电子邮箱
	 */
	 
	public void setDianziyouxiang(String dianziyouxiang) {
		this.dianziyouxiang = dianziyouxiang;
	}
	
	/**
	 * 获取：电子邮箱
	 */
	public String getDianziyouxiang() {
		return dianziyouxiang;
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
	 * 设置：认证照片
	 */
	 
	public void setRenzhengzhaopian(String renzhengzhaopian) {
		this.renzhengzhaopian = renzhengzhaopian;
	}
	
	/**
	 * 获取：认证照片
	 */
	public String getRenzhengzhaopian() {
		return renzhengzhaopian;
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
