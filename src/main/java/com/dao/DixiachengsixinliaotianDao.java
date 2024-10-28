package com.dao;

import com.entity.DixiachengsixinliaotianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DixiachengsixinliaotianVO;
import com.entity.view.DixiachengsixinliaotianView;


/**
 * 地下城私信聊天
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface DixiachengsixinliaotianDao extends BaseMapper<DixiachengsixinliaotianEntity> {
	
	List<DixiachengsixinliaotianVO> selectListVO(@Param("ew") Wrapper<DixiachengsixinliaotianEntity> wrapper);
	
	DixiachengsixinliaotianVO selectVO(@Param("ew") Wrapper<DixiachengsixinliaotianEntity> wrapper);
	
	List<DixiachengsixinliaotianView> selectListView(@Param("ew") Wrapper<DixiachengsixinliaotianEntity> wrapper);

	List<DixiachengsixinliaotianView> selectListView(Pagination page,@Param("ew") Wrapper<DixiachengsixinliaotianEntity> wrapper);
	
	DixiachengsixinliaotianView selectView(@Param("ew") Wrapper<DixiachengsixinliaotianEntity> wrapper);
	
}
