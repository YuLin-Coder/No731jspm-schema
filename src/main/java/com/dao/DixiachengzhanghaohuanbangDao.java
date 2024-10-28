package com.dao;

import com.entity.DixiachengzhanghaohuanbangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DixiachengzhanghaohuanbangVO;
import com.entity.view.DixiachengzhanghaohuanbangView;


/**
 * 地下城账号换绑
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface DixiachengzhanghaohuanbangDao extends BaseMapper<DixiachengzhanghaohuanbangEntity> {
	
	List<DixiachengzhanghaohuanbangVO> selectListVO(@Param("ew") Wrapper<DixiachengzhanghaohuanbangEntity> wrapper);
	
	DixiachengzhanghaohuanbangVO selectVO(@Param("ew") Wrapper<DixiachengzhanghaohuanbangEntity> wrapper);
	
	List<DixiachengzhanghaohuanbangView> selectListView(@Param("ew") Wrapper<DixiachengzhanghaohuanbangEntity> wrapper);

	List<DixiachengzhanghaohuanbangView> selectListView(Pagination page,@Param("ew") Wrapper<DixiachengzhanghaohuanbangEntity> wrapper);
	
	DixiachengzhanghaohuanbangView selectView(@Param("ew") Wrapper<DixiachengzhanghaohuanbangEntity> wrapper);
	
}
