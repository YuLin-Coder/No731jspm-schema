package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SixinliaotianhuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SixinliaotianhuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SixinliaotianhuifuView;


/**
 * 私信聊天回复
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface SixinliaotianhuifuService extends IService<SixinliaotianhuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SixinliaotianhuifuVO> selectListVO(Wrapper<SixinliaotianhuifuEntity> wrapper);
   	
   	SixinliaotianhuifuVO selectVO(@Param("ew") Wrapper<SixinliaotianhuifuEntity> wrapper);
   	
   	List<SixinliaotianhuifuView> selectListView(Wrapper<SixinliaotianhuifuEntity> wrapper);
   	
   	SixinliaotianhuifuView selectView(@Param("ew") Wrapper<SixinliaotianhuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SixinliaotianhuifuEntity> wrapper);
   	
}

