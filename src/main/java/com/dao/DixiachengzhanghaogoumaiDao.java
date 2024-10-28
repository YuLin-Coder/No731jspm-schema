package com.dao;

import com.entity.DixiachengzhanghaogoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DixiachengzhanghaogoumaiVO;
import com.entity.view.DixiachengzhanghaogoumaiView;


/**
 * 地下城账号购买
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface DixiachengzhanghaogoumaiDao extends BaseMapper<DixiachengzhanghaogoumaiEntity> {
	
	List<DixiachengzhanghaogoumaiVO> selectListVO(@Param("ew") Wrapper<DixiachengzhanghaogoumaiEntity> wrapper);
	
	DixiachengzhanghaogoumaiVO selectVO(@Param("ew") Wrapper<DixiachengzhanghaogoumaiEntity> wrapper);
	
	List<DixiachengzhanghaogoumaiView> selectListView(@Param("ew") Wrapper<DixiachengzhanghaogoumaiEntity> wrapper);

	List<DixiachengzhanghaogoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<DixiachengzhanghaogoumaiEntity> wrapper);
	
	DixiachengzhanghaogoumaiView selectView(@Param("ew") Wrapper<DixiachengzhanghaogoumaiEntity> wrapper);
	
}
