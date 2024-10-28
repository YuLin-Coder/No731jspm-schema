package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingxionglianmengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingxionglianmengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingxionglianmengView;


/**
 * 英雄联盟
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface YingxionglianmengService extends IService<YingxionglianmengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingxionglianmengVO> selectListVO(Wrapper<YingxionglianmengEntity> wrapper);
   	
   	YingxionglianmengVO selectVO(@Param("ew") Wrapper<YingxionglianmengEntity> wrapper);
   	
   	List<YingxionglianmengView> selectListView(Wrapper<YingxionglianmengEntity> wrapper);
   	
   	YingxionglianmengView selectView(@Param("ew") Wrapper<YingxionglianmengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingxionglianmengEntity> wrapper);
   	
}

