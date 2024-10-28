package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingxionglianmenghuanbangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingxionglianmenghuanbangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingxionglianmenghuanbangView;


/**
 * 英雄联盟换绑
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface YingxionglianmenghuanbangService extends IService<YingxionglianmenghuanbangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingxionglianmenghuanbangVO> selectListVO(Wrapper<YingxionglianmenghuanbangEntity> wrapper);
   	
   	YingxionglianmenghuanbangVO selectVO(@Param("ew") Wrapper<YingxionglianmenghuanbangEntity> wrapper);
   	
   	List<YingxionglianmenghuanbangView> selectListView(Wrapper<YingxionglianmenghuanbangEntity> wrapper);
   	
   	YingxionglianmenghuanbangView selectView(@Param("ew") Wrapper<YingxionglianmenghuanbangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingxionglianmenghuanbangEntity> wrapper);
   	
}

