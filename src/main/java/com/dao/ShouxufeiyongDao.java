package com.dao;

import com.entity.ShouxufeiyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouxufeiyongVO;
import com.entity.view.ShouxufeiyongView;


/**
 * 手续费用
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:13
 */
public interface ShouxufeiyongDao extends BaseMapper<ShouxufeiyongEntity> {
	
	List<ShouxufeiyongVO> selectListVO(@Param("ew") Wrapper<ShouxufeiyongEntity> wrapper);
	
	ShouxufeiyongVO selectVO(@Param("ew") Wrapper<ShouxufeiyongEntity> wrapper);
	
	List<ShouxufeiyongView> selectListView(@Param("ew") Wrapper<ShouxufeiyongEntity> wrapper);

	List<ShouxufeiyongView> selectListView(Pagination page,@Param("ew") Wrapper<ShouxufeiyongEntity> wrapper);
	
	ShouxufeiyongView selectView(@Param("ew") Wrapper<ShouxufeiyongEntity> wrapper);
	
}
