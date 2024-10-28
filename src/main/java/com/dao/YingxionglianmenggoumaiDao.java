package com.dao;

import com.entity.YingxionglianmenggoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingxionglianmenggoumaiVO;
import com.entity.view.YingxionglianmenggoumaiView;


/**
 * 英雄联盟购买
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface YingxionglianmenggoumaiDao extends BaseMapper<YingxionglianmenggoumaiEntity> {
	
	List<YingxionglianmenggoumaiVO> selectListVO(@Param("ew") Wrapper<YingxionglianmenggoumaiEntity> wrapper);
	
	YingxionglianmenggoumaiVO selectVO(@Param("ew") Wrapper<YingxionglianmenggoumaiEntity> wrapper);
	
	List<YingxionglianmenggoumaiView> selectListView(@Param("ew") Wrapper<YingxionglianmenggoumaiEntity> wrapper);

	List<YingxionglianmenggoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<YingxionglianmenggoumaiEntity> wrapper);
	
	YingxionglianmenggoumaiView selectView(@Param("ew") Wrapper<YingxionglianmenggoumaiEntity> wrapper);
	
}
