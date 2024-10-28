package com.dao;

import com.entity.DiscussyouxizhanghaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouxizhanghaoVO;
import com.entity.view.DiscussyouxizhanghaoView;


/**
 * 游戏账号评论表
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface DiscussyouxizhanghaoDao extends BaseMapper<DiscussyouxizhanghaoEntity> {
	
	List<DiscussyouxizhanghaoVO> selectListVO(@Param("ew") Wrapper<DiscussyouxizhanghaoEntity> wrapper);
	
	DiscussyouxizhanghaoVO selectVO(@Param("ew") Wrapper<DiscussyouxizhanghaoEntity> wrapper);
	
	List<DiscussyouxizhanghaoView> selectListView(@Param("ew") Wrapper<DiscussyouxizhanghaoEntity> wrapper);

	List<DiscussyouxizhanghaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouxizhanghaoEntity> wrapper);
	
	DiscussyouxizhanghaoView selectView(@Param("ew") Wrapper<DiscussyouxizhanghaoEntity> wrapper);
	
}
