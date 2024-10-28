package com.dao;

import com.entity.YouxizhanghaoshensuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxizhanghaoshensuVO;
import com.entity.view.YouxizhanghaoshensuView;


/**
 * 游戏账号申诉
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface YouxizhanghaoshensuDao extends BaseMapper<YouxizhanghaoshensuEntity> {
	
	List<YouxizhanghaoshensuVO> selectListVO(@Param("ew") Wrapper<YouxizhanghaoshensuEntity> wrapper);
	
	YouxizhanghaoshensuVO selectVO(@Param("ew") Wrapper<YouxizhanghaoshensuEntity> wrapper);
	
	List<YouxizhanghaoshensuView> selectListView(@Param("ew") Wrapper<YouxizhanghaoshensuEntity> wrapper);

	List<YouxizhanghaoshensuView> selectListView(Pagination page,@Param("ew") Wrapper<YouxizhanghaoshensuEntity> wrapper);
	
	YouxizhanghaoshensuView selectView(@Param("ew") Wrapper<YouxizhanghaoshensuEntity> wrapper);
	
}
