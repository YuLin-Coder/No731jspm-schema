package com.entity.model;

import com.entity.ShouxufeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 手续费用
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-10-21 09:13:13
 */
public class ShouxufeiyongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 手续费
	 */
	
	private Integer shouxufei;
		
	/**
	 * 平台保障
	 */
	
	private String pingtaibaozhang;
				
	
	/**
	 * 设置：手续费
	 */
	 
	public void setShouxufei(Integer shouxufei) {
		this.shouxufei = shouxufei;
	}
	
	/**
	 * 获取：手续费
	 */
	public Integer getShouxufei() {
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
			
}
