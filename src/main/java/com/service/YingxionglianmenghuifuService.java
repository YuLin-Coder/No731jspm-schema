package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingxionglianmenghuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingxionglianmenghuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingxionglianmenghuifuView;


/**
 * 英雄联盟回复
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface YingxionglianmenghuifuService extends IService<YingxionglianmenghuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingxionglianmenghuifuVO> selectListVO(Wrapper<YingxionglianmenghuifuEntity> wrapper);
   	
   	YingxionglianmenghuifuVO selectVO(@Param("ew") Wrapper<YingxionglianmenghuifuEntity> wrapper);
   	
   	List<YingxionglianmenghuifuView> selectListView(Wrapper<YingxionglianmenghuifuEntity> wrapper);
   	
   	YingxionglianmenghuifuView selectView(@Param("ew") Wrapper<YingxionglianmenghuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingxionglianmenghuifuEntity> wrapper);
   	
}

