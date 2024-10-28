package com.entity.view;

import com.entity.YingxionglianmengshensuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 英雄联盟申诉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
@TableName("yingxionglianmengshensu")
public class YingxionglianmengshensuView  extends YingxionglianmengshensuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingxionglianmengshensuView(){
	}
 
 	public YingxionglianmengshensuView(YingxionglianmengshensuEntity yingxionglianmengshensuEntity){
 	try {
			BeanUtils.copyProperties(this, yingxionglianmengshensuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
