package com.entity.view;

import com.entity.DixiachengzhanghaohuanbangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 地下城账号换绑
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
@TableName("dixiachengzhanghaohuanbang")
public class DixiachengzhanghaohuanbangView  extends DixiachengzhanghaohuanbangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DixiachengzhanghaohuanbangView(){
	}
 
 	public DixiachengzhanghaohuanbangView(DixiachengzhanghaohuanbangEntity dixiachengzhanghaohuanbangEntity){
 	try {
			BeanUtils.copyProperties(this, dixiachengzhanghaohuanbangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
