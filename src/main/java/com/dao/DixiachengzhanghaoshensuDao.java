package com.dao;

import com.entity.DixiachengzhanghaoshensuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DixiachengzhanghaoshensuVO;
import com.entity.view.DixiachengzhanghaoshensuView;


/**
 * 地下城账号申诉
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface DixiachengzhanghaoshensuDao extends BaseMapper<DixiachengzhanghaoshensuEntity> {
	
	List<DixiachengzhanghaoshensuVO> selectListVO(@Param("ew") Wrapper<DixiachengzhanghaoshensuEntity> wrapper);
	
	DixiachengzhanghaoshensuVO selectVO(@Param("ew") Wrapper<DixiachengzhanghaoshensuEntity> wrapper);
	
	List<DixiachengzhanghaoshensuView> selectListView(@Param("ew") Wrapper<DixiachengzhanghaoshensuEntity> wrapper);

	List<DixiachengzhanghaoshensuView> selectListView(Pagination page,@Param("ew") Wrapper<DixiachengzhanghaoshensuEntity> wrapper);
	
	DixiachengzhanghaoshensuView selectView(@Param("ew") Wrapper<DixiachengzhanghaoshensuEntity> wrapper);
	
}
