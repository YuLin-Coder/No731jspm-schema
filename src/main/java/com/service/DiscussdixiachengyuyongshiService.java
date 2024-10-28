package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdixiachengyuyongshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdixiachengyuyongshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdixiachengyuyongshiView;


/**
 * 地下城与勇士评论表
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface DiscussdixiachengyuyongshiService extends IService<DiscussdixiachengyuyongshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdixiachengyuyongshiVO> selectListVO(Wrapper<DiscussdixiachengyuyongshiEntity> wrapper);
   	
   	DiscussdixiachengyuyongshiVO selectVO(@Param("ew") Wrapper<DiscussdixiachengyuyongshiEntity> wrapper);
   	
   	List<DiscussdixiachengyuyongshiView> selectListView(Wrapper<DiscussdixiachengyuyongshiEntity> wrapper);
   	
   	DiscussdixiachengyuyongshiView selectView(@Param("ew") Wrapper<DiscussdixiachengyuyongshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdixiachengyuyongshiEntity> wrapper);
   	
}

