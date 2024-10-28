package com.entity.view;

import com.entity.SixinliaotianjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 私信聊天记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
@TableName("sixinliaotianjilu")
public class SixinliaotianjiluView  extends SixinliaotianjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SixinliaotianjiluView(){
	}
 
 	public SixinliaotianjiluView(SixinliaotianjiluEntity sixinliaotianjiluEntity){
 	try {
			BeanUtils.copyProperties(this, sixinliaotianjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
