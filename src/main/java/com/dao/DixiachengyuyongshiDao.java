package com.dao;

import com.entity.DixiachengyuyongshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DixiachengyuyongshiVO;
import com.entity.view.DixiachengyuyongshiView;


/**
 * 地下城与勇士
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface DixiachengyuyongshiDao extends BaseMapper<DixiachengyuyongshiEntity> {
	
	List<DixiachengyuyongshiVO> selectListVO(@Param("ew") Wrapper<DixiachengyuyongshiEntity> wrapper);
	
	DixiachengyuyongshiVO selectVO(@Param("ew") Wrapper<DixiachengyuyongshiEntity> wrapper);
	
	List<DixiachengyuyongshiView> selectListView(@Param("ew") Wrapper<DixiachengyuyongshiEntity> wrapper);

	List<DixiachengyuyongshiView> selectListView(Pagination page,@Param("ew") Wrapper<DixiachengyuyongshiEntity> wrapper);
	
	DixiachengyuyongshiView selectView(@Param("ew") Wrapper<DixiachengyuyongshiEntity> wrapper);
	
}
