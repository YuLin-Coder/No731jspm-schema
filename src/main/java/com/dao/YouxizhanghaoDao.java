package com.dao;

import com.entity.YouxizhanghaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxizhanghaoVO;
import com.entity.view.YouxizhanghaoView;


/**
 * 游戏账号
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface YouxizhanghaoDao extends BaseMapper<YouxizhanghaoEntity> {
	
	List<YouxizhanghaoVO> selectListVO(@Param("ew") Wrapper<YouxizhanghaoEntity> wrapper);
	
	YouxizhanghaoVO selectVO(@Param("ew") Wrapper<YouxizhanghaoEntity> wrapper);
	
	List<YouxizhanghaoView> selectListView(@Param("ew") Wrapper<YouxizhanghaoEntity> wrapper);

	List<YouxizhanghaoView> selectListView(Pagination page,@Param("ew") Wrapper<YouxizhanghaoEntity> wrapper);
	
	YouxizhanghaoView selectView(@Param("ew") Wrapper<YouxizhanghaoEntity> wrapper);
	
}
