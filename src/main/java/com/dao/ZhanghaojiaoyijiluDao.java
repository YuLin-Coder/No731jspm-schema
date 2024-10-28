package com.dao;

import com.entity.ZhanghaojiaoyijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhanghaojiaoyijiluVO;
import com.entity.view.ZhanghaojiaoyijiluView;


/**
 * 账号交易记录
 * 
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface ZhanghaojiaoyijiluDao extends BaseMapper<ZhanghaojiaoyijiluEntity> {
	
	List<ZhanghaojiaoyijiluVO> selectListVO(@Param("ew") Wrapper<ZhanghaojiaoyijiluEntity> wrapper);
	
	ZhanghaojiaoyijiluVO selectVO(@Param("ew") Wrapper<ZhanghaojiaoyijiluEntity> wrapper);
	
	List<ZhanghaojiaoyijiluView> selectListView(@Param("ew") Wrapper<ZhanghaojiaoyijiluEntity> wrapper);

	List<ZhanghaojiaoyijiluView> selectListView(Pagination page,@Param("ew") Wrapper<ZhanghaojiaoyijiluEntity> wrapper);
	
	ZhanghaojiaoyijiluView selectView(@Param("ew") Wrapper<ZhanghaojiaoyijiluEntity> wrapper);
	
}
