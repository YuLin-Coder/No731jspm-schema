package com.entity.view;

import com.entity.YouxizhanghaoshensuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游戏账号申诉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
@TableName("youxizhanghaoshensu")
public class YouxizhanghaoshensuView  extends YouxizhanghaoshensuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxizhanghaoshensuView(){
	}
 
 	public YouxizhanghaoshensuView(YouxizhanghaoshensuEntity youxizhanghaoshensuEntity){
 	try {
			BeanUtils.copyProperties(this, youxizhanghaoshensuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
