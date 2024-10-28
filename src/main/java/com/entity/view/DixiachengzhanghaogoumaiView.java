package com.entity.view;

import com.entity.DixiachengzhanghaogoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 地下城账号购买
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
@TableName("dixiachengzhanghaogoumai")
public class DixiachengzhanghaogoumaiView  extends DixiachengzhanghaogoumaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DixiachengzhanghaogoumaiView(){
	}
 
 	public DixiachengzhanghaogoumaiView(DixiachengzhanghaogoumaiEntity dixiachengzhanghaogoumaiEntity){
 	try {
			BeanUtils.copyProperties(this, dixiachengzhanghaogoumaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
