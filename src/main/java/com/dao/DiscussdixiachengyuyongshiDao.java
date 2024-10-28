package com.dao;

import com.entity.DiscussdixiachengyuyongshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdixiachengyuyongshiVO;
import com.entity.view.DiscussdixiachengyuyongshiView;


/**
 * 地下城与勇士评论表
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface DiscussdixiachengyuyongshiDao extends BaseMapper<DiscussdixiachengyuyongshiEntity> {
	
	List<DiscussdixiachengyuyongshiVO> selectListVO(@Param("ew") Wrapper<DiscussdixiachengyuyongshiEntity> wrapper);
	
	DiscussdixiachengyuyongshiVO selectVO(@Param("ew") Wrapper<DiscussdixiachengyuyongshiEntity> wrapper);
	
	List<DiscussdixiachengyuyongshiView> selectListView(@Param("ew") Wrapper<DiscussdixiachengyuyongshiEntity> wrapper);

	List<DiscussdixiachengyuyongshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdixiachengyuyongshiEntity> wrapper);
	
	DiscussdixiachengyuyongshiView selectView(@Param("ew") Wrapper<DiscussdixiachengyuyongshiEntity> wrapper);
	
}
