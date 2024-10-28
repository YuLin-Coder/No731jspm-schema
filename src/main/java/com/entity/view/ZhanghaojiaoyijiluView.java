package com.entity.view;

import com.entity.ZhanghaojiaoyijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 账号交易记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
@TableName("zhanghaojiaoyijilu")
public class ZhanghaojiaoyijiluView  extends ZhanghaojiaoyijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhanghaojiaoyijiluView(){
	}
 
 	public ZhanghaojiaoyijiluView(ZhanghaojiaoyijiluEntity zhanghaojiaoyijiluEntity){
 	try {
			BeanUtils.copyProperties(this, zhanghaojiaoyijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
