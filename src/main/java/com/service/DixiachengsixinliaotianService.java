package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DixiachengsixinliaotianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DixiachengsixinliaotianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DixiachengsixinliaotianView;


/**
 * 地下城私信聊天
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface DixiachengsixinliaotianService extends IService<DixiachengsixinliaotianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DixiachengsixinliaotianVO> selectListVO(Wrapper<DixiachengsixinliaotianEntity> wrapper);
   	
   	DixiachengsixinliaotianVO selectVO(@Param("ew") Wrapper<DixiachengsixinliaotianEntity> wrapper);
   	
   	List<DixiachengsixinliaotianView> selectListView(Wrapper<DixiachengsixinliaotianEntity> wrapper);
   	
   	DixiachengsixinliaotianView selectView(@Param("ew") Wrapper<DixiachengsixinliaotianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DixiachengsixinliaotianEntity> wrapper);
   	
}

