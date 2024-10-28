package com.dao;

import com.entity.SixinliaotianjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SixinliaotianjiluVO;
import com.entity.view.SixinliaotianjiluView;


/**
 * 私信聊天记录
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface SixinliaotianjiluDao extends BaseMapper<SixinliaotianjiluEntity> {
	
	List<SixinliaotianjiluVO> selectListVO(@Param("ew") Wrapper<SixinliaotianjiluEntity> wrapper);
	
	SixinliaotianjiluVO selectVO(@Param("ew") Wrapper<SixinliaotianjiluEntity> wrapper);
	
	List<SixinliaotianjiluView> selectListView(@Param("ew") Wrapper<SixinliaotianjiluEntity> wrapper);

	List<SixinliaotianjiluView> selectListView(Pagination page,@Param("ew") Wrapper<SixinliaotianjiluEntity> wrapper);
	
	SixinliaotianjiluView selectView(@Param("ew") Wrapper<SixinliaotianjiluEntity> wrapper);
	
}
