package com.dao;

import com.entity.YingxionglianmengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingxionglianmengVO;
import com.entity.view.YingxionglianmengView;


/**
 * 英雄联盟
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface YingxionglianmengDao extends BaseMapper<YingxionglianmengEntity> {
	
	List<YingxionglianmengVO> selectListVO(@Param("ew") Wrapper<YingxionglianmengEntity> wrapper);
	
	YingxionglianmengVO selectVO(@Param("ew") Wrapper<YingxionglianmengEntity> wrapper);
	
	List<YingxionglianmengView> selectListView(@Param("ew") Wrapper<YingxionglianmengEntity> wrapper);

	List<YingxionglianmengView> selectListView(Pagination page,@Param("ew") Wrapper<YingxionglianmengEntity> wrapper);
	
	YingxionglianmengView selectView(@Param("ew") Wrapper<YingxionglianmengEntity> wrapper);
	
}
