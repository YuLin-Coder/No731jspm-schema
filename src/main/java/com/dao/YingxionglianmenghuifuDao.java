package com.dao;

import com.entity.YingxionglianmenghuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingxionglianmenghuifuVO;
import com.entity.view.YingxionglianmenghuifuView;


/**
 * 英雄联盟回复
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface YingxionglianmenghuifuDao extends BaseMapper<YingxionglianmenghuifuEntity> {
	
	List<YingxionglianmenghuifuVO> selectListVO(@Param("ew") Wrapper<YingxionglianmenghuifuEntity> wrapper);
	
	YingxionglianmenghuifuVO selectVO(@Param("ew") Wrapper<YingxionglianmenghuifuEntity> wrapper);
	
	List<YingxionglianmenghuifuView> selectListView(@Param("ew") Wrapper<YingxionglianmenghuifuEntity> wrapper);

	List<YingxionglianmenghuifuView> selectListView(Pagination page,@Param("ew") Wrapper<YingxionglianmenghuifuEntity> wrapper);
	
	YingxionglianmenghuifuView selectView(@Param("ew") Wrapper<YingxionglianmenghuifuEntity> wrapper);
	
}
