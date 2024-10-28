package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouxizhanghaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouxizhanghaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouxizhanghaoView;


/**
 * 游戏账号评论表
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface DiscussyouxizhanghaoService extends IService<DiscussyouxizhanghaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouxizhanghaoVO> selectListVO(Wrapper<DiscussyouxizhanghaoEntity> wrapper);
   	
   	DiscussyouxizhanghaoVO selectVO(@Param("ew") Wrapper<DiscussyouxizhanghaoEntity> wrapper);
   	
   	List<DiscussyouxizhanghaoView> selectListView(Wrapper<DiscussyouxizhanghaoEntity> wrapper);
   	
   	DiscussyouxizhanghaoView selectView(@Param("ew") Wrapper<DiscussyouxizhanghaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouxizhanghaoEntity> wrapper);
   	
}

