package com.dao;

import com.entity.DiscussyingxionglianmengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyingxionglianmengVO;
import com.entity.view.DiscussyingxionglianmengView;


/**
 * 英雄联盟评论表
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface DiscussyingxionglianmengDao extends BaseMapper<DiscussyingxionglianmengEntity> {
	
	List<DiscussyingxionglianmengVO> selectListVO(@Param("ew") Wrapper<DiscussyingxionglianmengEntity> wrapper);
	
	DiscussyingxionglianmengVO selectVO(@Param("ew") Wrapper<DiscussyingxionglianmengEntity> wrapper);
	
	List<DiscussyingxionglianmengView> selectListView(@Param("ew") Wrapper<DiscussyingxionglianmengEntity> wrapper);

	List<DiscussyingxionglianmengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyingxionglianmengEntity> wrapper);
	
	DiscussyingxionglianmengView selectView(@Param("ew") Wrapper<DiscussyingxionglianmengEntity> wrapper);
	
}
