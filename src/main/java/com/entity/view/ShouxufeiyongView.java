package com.entity.view;

import com.entity.ShouxufeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 手续费用
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:13
 */
@TableName("shouxufeiyong")
public class ShouxufeiyongView  extends ShouxufeiyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShouxufeiyongView(){
	}
 
 	public ShouxufeiyongView(ShouxufeiyongEntity shouxufeiyongEntity){
 	try {
			BeanUtils.copyProperties(this, shouxufeiyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
