package com.dao;

import com.entity.YingxionglianmengshensuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingxionglianmengshensuVO;
import com.entity.view.YingxionglianmengshensuView;


/**
 * 英雄联盟申诉
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface YingxionglianmengshensuDao extends BaseMapper<YingxionglianmengshensuEntity> {
	
	List<YingxionglianmengshensuVO> selectListVO(@Param("ew") Wrapper<YingxionglianmengshensuEntity> wrapper);
	
	YingxionglianmengshensuVO selectVO(@Param("ew") Wrapper<YingxionglianmengshensuEntity> wrapper);
	
	List<YingxionglianmengshensuView> selectListView(@Param("ew") Wrapper<YingxionglianmengshensuEntity> wrapper);

	List<YingxionglianmengshensuView> selectListView(Pagination page,@Param("ew") Wrapper<YingxionglianmengshensuEntity> wrapper);
	
	YingxionglianmengshensuView selectView(@Param("ew") Wrapper<YingxionglianmengshensuEntity> wrapper);
	
}
