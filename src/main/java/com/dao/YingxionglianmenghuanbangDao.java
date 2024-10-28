package com.dao;

import com.entity.YingxionglianmenghuanbangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingxionglianmenghuanbangVO;
import com.entity.view.YingxionglianmenghuanbangView;


/**
 * 英雄联盟换绑
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface YingxionglianmenghuanbangDao extends BaseMapper<YingxionglianmenghuanbangEntity> {
	
	List<YingxionglianmenghuanbangVO> selectListVO(@Param("ew") Wrapper<YingxionglianmenghuanbangEntity> wrapper);
	
	YingxionglianmenghuanbangVO selectVO(@Param("ew") Wrapper<YingxionglianmenghuanbangEntity> wrapper);
	
	List<YingxionglianmenghuanbangView> selectListView(@Param("ew") Wrapper<YingxionglianmenghuanbangEntity> wrapper);

	List<YingxionglianmenghuanbangView> selectListView(Pagination page,@Param("ew") Wrapper<YingxionglianmenghuanbangEntity> wrapper);
	
	YingxionglianmenghuanbangView selectView(@Param("ew") Wrapper<YingxionglianmenghuanbangEntity> wrapper);
	
}
