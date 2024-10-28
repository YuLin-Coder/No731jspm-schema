package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingxionglianmengshensuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingxionglianmengshensuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingxionglianmengshensuView;


/**
 * 英雄联盟申诉
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface YingxionglianmengshensuService extends IService<YingxionglianmengshensuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingxionglianmengshensuVO> selectListVO(Wrapper<YingxionglianmengshensuEntity> wrapper);
   	
   	YingxionglianmengshensuVO selectVO(@Param("ew") Wrapper<YingxionglianmengshensuEntity> wrapper);
   	
   	List<YingxionglianmengshensuView> selectListView(Wrapper<YingxionglianmengshensuEntity> wrapper);
   	
   	YingxionglianmengshensuView selectView(@Param("ew") Wrapper<YingxionglianmengshensuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingxionglianmengshensuEntity> wrapper);
   	
}

