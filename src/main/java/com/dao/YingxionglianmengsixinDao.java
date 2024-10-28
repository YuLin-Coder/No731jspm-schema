package com.dao;

import com.entity.YingxionglianmengsixinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingxionglianmengsixinVO;
import com.entity.view.YingxionglianmengsixinView;


/**
 * 英雄联盟私信
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface YingxionglianmengsixinDao extends BaseMapper<YingxionglianmengsixinEntity> {
	
	List<YingxionglianmengsixinVO> selectListVO(@Param("ew") Wrapper<YingxionglianmengsixinEntity> wrapper);
	
	YingxionglianmengsixinVO selectVO(@Param("ew") Wrapper<YingxionglianmengsixinEntity> wrapper);
	
	List<YingxionglianmengsixinView> selectListView(@Param("ew") Wrapper<YingxionglianmengsixinEntity> wrapper);

	List<YingxionglianmengsixinView> selectListView(Pagination page,@Param("ew") Wrapper<YingxionglianmengsixinEntity> wrapper);
	
	YingxionglianmengsixinView selectView(@Param("ew") Wrapper<YingxionglianmengsixinEntity> wrapper);
	
}
