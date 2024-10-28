package com.entity.view;

import com.entity.YouxizhanghaohuanbangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游戏账号换绑
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
@TableName("youxizhanghaohuanbang")
public class YouxizhanghaohuanbangView  extends YouxizhanghaohuanbangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxizhanghaohuanbangView(){
	}
 
 	public YouxizhanghaohuanbangView(YouxizhanghaohuanbangEntity youxizhanghaohuanbangEntity){
 	try {
			BeanUtils.copyProperties(this, youxizhanghaohuanbangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
