package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyingxionglianmengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyingxionglianmengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyingxionglianmengView;


/**
 * 英雄联盟评论表
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface DiscussyingxionglianmengService extends IService<DiscussyingxionglianmengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyingxionglianmengVO> selectListVO(Wrapper<DiscussyingxionglianmengEntity> wrapper);
   	
   	DiscussyingxionglianmengVO selectVO(@Param("ew") Wrapper<DiscussyingxionglianmengEntity> wrapper);
   	
   	List<DiscussyingxionglianmengView> selectListView(Wrapper<DiscussyingxionglianmengEntity> wrapper);
   	
   	DiscussyingxionglianmengView selectView(@Param("ew") Wrapper<DiscussyingxionglianmengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyingxionglianmengEntity> wrapper);
   	
}

