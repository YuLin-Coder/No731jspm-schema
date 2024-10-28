package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DixiachengzhanghaoshensuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DixiachengzhanghaoshensuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DixiachengzhanghaoshensuView;


/**
 * 地下城账号申诉
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface DixiachengzhanghaoshensuService extends IService<DixiachengzhanghaoshensuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DixiachengzhanghaoshensuVO> selectListVO(Wrapper<DixiachengzhanghaoshensuEntity> wrapper);
   	
   	DixiachengzhanghaoshensuVO selectVO(@Param("ew") Wrapper<DixiachengzhanghaoshensuEntity> wrapper);
   	
   	List<DixiachengzhanghaoshensuView> selectListView(Wrapper<DixiachengzhanghaoshensuEntity> wrapper);
   	
   	DixiachengzhanghaoshensuView selectView(@Param("ew") Wrapper<DixiachengzhanghaoshensuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DixiachengzhanghaoshensuEntity> wrapper);
   	
}

