package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SixinliaotianjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SixinliaotianjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SixinliaotianjiluView;


/**
 * 私信聊天记录
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface SixinliaotianjiluService extends IService<SixinliaotianjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SixinliaotianjiluVO> selectListVO(Wrapper<SixinliaotianjiluEntity> wrapper);
   	
   	SixinliaotianjiluVO selectVO(@Param("ew") Wrapper<SixinliaotianjiluEntity> wrapper);
   	
   	List<SixinliaotianjiluView> selectListView(Wrapper<SixinliaotianjiluEntity> wrapper);
   	
   	SixinliaotianjiluView selectView(@Param("ew") Wrapper<SixinliaotianjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SixinliaotianjiluEntity> wrapper);
   	
}

