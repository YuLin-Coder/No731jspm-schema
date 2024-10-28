package com.entity.vo;

import com.entity.SixinliaotianhuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 私信聊天回复
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public class SixinliaotianhuifuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 游戏分类
	 */
	
	private String youxifenlei;
		
	/**
	 * 卖家账号
	 */
	
	private String maijiazhanghao;
		
	/**
	 * 卖家回复
	 */
	
	private String maijiahuifu;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 用户留言
	 */
	
	private String yonghuliuyan;
				
	
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
	 * 设置：卖家回复
	 */
	 
	public void setMaijiahuifu(String maijiahuifu) {
		this.maijiahuifu = maijiahuifu;
	}
	
	/**
	 * 获取：卖家回复
	 */
	public String getMaijiahuifu() {
		return maijiahuifu;
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
	 * 设置：用户留言
	 */
	 
	public void setYonghuliuyan(String yonghuliuyan) {
		this.yonghuliuyan = yonghuliuyan;
	}
	
	/**
	 * 获取：用户留言
	 */
	public String getYonghuliuyan() {
		return yonghuliuyan;
	}
			
}
