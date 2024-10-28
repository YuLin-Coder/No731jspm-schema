package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxizhanghaohuanbangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxizhanghaohuanbangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxizhanghaohuanbangView;


/**
 * 游戏账号换绑
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface YouxizhanghaohuanbangService extends IService<YouxizhanghaohuanbangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxizhanghaohuanbangVO> selectListVO(Wrapper<YouxizhanghaohuanbangEntity> wrapper);
   	
   	YouxizhanghaohuanbangVO selectVO(@Param("ew") Wrapper<YouxizhanghaohuanbangEntity> wrapper);
   	
   	List<YouxizhanghaohuanbangView> selectListView(Wrapper<YouxizhanghaohuanbangEntity> wrapper);
   	
   	YouxizhanghaohuanbangView selectView(@Param("ew") Wrapper<YouxizhanghaohuanbangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxizhanghaohuanbangEntity> wrapper);
   	
}

