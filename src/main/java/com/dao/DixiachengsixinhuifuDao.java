package com.dao;

import com.entity.DixiachengsixinhuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DixiachengsixinhuifuVO;
import com.entity.view.DixiachengsixinhuifuView;


/**
 * 地下城私信回复
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface DixiachengsixinhuifuDao extends BaseMapper<DixiachengsixinhuifuEntity> {
	
	List<DixiachengsixinhuifuVO> selectListVO(@Param("ew") Wrapper<DixiachengsixinhuifuEntity> wrapper);
	
	DixiachengsixinhuifuVO selectVO(@Param("ew") Wrapper<DixiachengsixinhuifuEntity> wrapper);
	
	List<DixiachengsixinhuifuView> selectListView(@Param("ew") Wrapper<DixiachengsixinhuifuEntity> wrapper);

	List<DixiachengsixinhuifuView> selectListView(Pagination page,@Param("ew") Wrapper<DixiachengsixinhuifuEntity> wrapper);
	
	DixiachengsixinhuifuView selectView(@Param("ew") Wrapper<DixiachengsixinhuifuEntity> wrapper);
	
}
