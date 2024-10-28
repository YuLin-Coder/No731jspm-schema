package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DixiachengyuyongshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DixiachengyuyongshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DixiachengyuyongshiView;


/**
 * 地下城与勇士
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface DixiachengyuyongshiService extends IService<DixiachengyuyongshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DixiachengyuyongshiVO> selectListVO(Wrapper<DixiachengyuyongshiEntity> wrapper);
   	
   	DixiachengyuyongshiVO selectVO(@Param("ew") Wrapper<DixiachengyuyongshiEntity> wrapper);
   	
   	List<DixiachengyuyongshiView> selectListView(Wrapper<DixiachengyuyongshiEntity> wrapper);
   	
   	DixiachengyuyongshiView selectView(@Param("ew") Wrapper<DixiachengyuyongshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DixiachengyuyongshiEntity> wrapper);
   	
}

