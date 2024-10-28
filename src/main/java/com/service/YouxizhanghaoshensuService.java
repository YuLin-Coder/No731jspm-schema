package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxizhanghaoshensuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxizhanghaoshensuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxizhanghaoshensuView;


/**
 * 游戏账号申诉
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface YouxizhanghaoshensuService extends IService<YouxizhanghaoshensuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxizhanghaoshensuVO> selectListVO(Wrapper<YouxizhanghaoshensuEntity> wrapper);
   	
   	YouxizhanghaoshensuVO selectVO(@Param("ew") Wrapper<YouxizhanghaoshensuEntity> wrapper);
   	
   	List<YouxizhanghaoshensuView> selectListView(Wrapper<YouxizhanghaoshensuEntity> wrapper);
   	
   	YouxizhanghaoshensuView selectView(@Param("ew") Wrapper<YouxizhanghaoshensuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxizhanghaoshensuEntity> wrapper);
   	
}

