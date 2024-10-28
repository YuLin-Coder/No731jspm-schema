package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingxionglianmenggoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingxionglianmenggoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingxionglianmenggoumaiView;


/**
 * 英雄联盟购买
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface YingxionglianmenggoumaiService extends IService<YingxionglianmenggoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingxionglianmenggoumaiVO> selectListVO(Wrapper<YingxionglianmenggoumaiEntity> wrapper);
   	
   	YingxionglianmenggoumaiVO selectVO(@Param("ew") Wrapper<YingxionglianmenggoumaiEntity> wrapper);
   	
   	List<YingxionglianmenggoumaiView> selectListView(Wrapper<YingxionglianmenggoumaiEntity> wrapper);
   	
   	YingxionglianmenggoumaiView selectView(@Param("ew") Wrapper<YingxionglianmenggoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingxionglianmenggoumaiEntity> wrapper);
   	
}

