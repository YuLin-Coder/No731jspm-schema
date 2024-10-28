package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingxionglianmengsixinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingxionglianmengsixinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingxionglianmengsixinView;


/**
 * 英雄联盟私信
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface YingxionglianmengsixinService extends IService<YingxionglianmengsixinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingxionglianmengsixinVO> selectListVO(Wrapper<YingxionglianmengsixinEntity> wrapper);
   	
   	YingxionglianmengsixinVO selectVO(@Param("ew") Wrapper<YingxionglianmengsixinEntity> wrapper);
   	
   	List<YingxionglianmengsixinView> selectListView(Wrapper<YingxionglianmengsixinEntity> wrapper);
   	
   	YingxionglianmengsixinView selectView(@Param("ew") Wrapper<YingxionglianmengsixinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingxionglianmengsixinEntity> wrapper);
   	
}

