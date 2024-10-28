package com.dao;

import com.entity.YouxizhanghaohuanbangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxizhanghaohuanbangVO;
import com.entity.view.YouxizhanghaohuanbangView;


/**
 * 游戏账号换绑
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface YouxizhanghaohuanbangDao extends BaseMapper<YouxizhanghaohuanbangEntity> {
	
	List<YouxizhanghaohuanbangVO> selectListVO(@Param("ew") Wrapper<YouxizhanghaohuanbangEntity> wrapper);
	
	YouxizhanghaohuanbangVO selectVO(@Param("ew") Wrapper<YouxizhanghaohuanbangEntity> wrapper);
	
	List<YouxizhanghaohuanbangView> selectListView(@Param("ew") Wrapper<YouxizhanghaohuanbangEntity> wrapper);

	List<YouxizhanghaohuanbangView> selectListView(Pagination page,@Param("ew") Wrapper<YouxizhanghaohuanbangEntity> wrapper);
	
	YouxizhanghaohuanbangView selectView(@Param("ew") Wrapper<YouxizhanghaohuanbangEntity> wrapper);
	
}
