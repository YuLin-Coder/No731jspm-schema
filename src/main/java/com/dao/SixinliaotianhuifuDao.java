package com.dao;

import com.entity.SixinliaotianhuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SixinliaotianhuifuVO;
import com.entity.view.SixinliaotianhuifuView;


/**
 * 私信聊天回复
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface SixinliaotianhuifuDao extends BaseMapper<SixinliaotianhuifuEntity> {
	
	List<SixinliaotianhuifuVO> selectListVO(@Param("ew") Wrapper<SixinliaotianhuifuEntity> wrapper);
	
	SixinliaotianhuifuVO selectVO(@Param("ew") Wrapper<SixinliaotianhuifuEntity> wrapper);
	
	List<SixinliaotianhuifuView> selectListView(@Param("ew") Wrapper<SixinliaotianhuifuEntity> wrapper);

	List<SixinliaotianhuifuView> selectListView(Pagination page,@Param("ew") Wrapper<SixinliaotianhuifuEntity> wrapper);
	
	SixinliaotianhuifuView selectView(@Param("ew") Wrapper<SixinliaotianhuifuEntity> wrapper);
	
}
