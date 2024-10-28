package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DixiachengsixinhuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DixiachengsixinhuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DixiachengsixinhuifuView;


/**
 * 地下城私信回复
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface DixiachengsixinhuifuService extends IService<DixiachengsixinhuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DixiachengsixinhuifuVO> selectListVO(Wrapper<DixiachengsixinhuifuEntity> wrapper);
   	
   	DixiachengsixinhuifuVO selectVO(@Param("ew") Wrapper<DixiachengsixinhuifuEntity> wrapper);
   	
   	List<DixiachengsixinhuifuView> selectListView(Wrapper<DixiachengsixinhuifuEntity> wrapper);
   	
   	DixiachengsixinhuifuView selectView(@Param("ew") Wrapper<DixiachengsixinhuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DixiachengsixinhuifuEntity> wrapper);
   	
}

