package com.entity.model;

import com.entity.YingxionglianmenghuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 英雄联盟回复
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public class YingxionglianmenghuifuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 用户回复
	 */
	
	private String yonghuhuifu;
				
	
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
	 * 设置：用户回复
	 */
	 
	public void setYonghuhuifu(String yonghuhuifu) {
		this.yonghuhuifu = yonghuhuifu;
	}
	
	/**
	 * 获取：用户回复
	 */
	public String getYonghuhuifu() {
		return yonghuhuifu;
	}
			
}
