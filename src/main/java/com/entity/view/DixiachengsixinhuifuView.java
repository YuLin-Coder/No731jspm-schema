package com.entity.view;

import com.entity.DixiachengsixinhuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 地下城私信回复
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
@TableName("dixiachengsixinhuifu")
public class DixiachengsixinhuifuView  extends DixiachengsixinhuifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DixiachengsixinhuifuView(){
	}
 
 	public DixiachengsixinhuifuView(DixiachengsixinhuifuEntity dixiachengsixinhuifuEntity){
 	try {
			BeanUtils.copyProperties(this, dixiachengsixinhuifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
