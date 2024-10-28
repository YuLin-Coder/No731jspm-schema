package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouxufeiyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouxufeiyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouxufeiyongView;


/**
 * 手续费用
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:13
 */
public interface ShouxufeiyongService extends IService<ShouxufeiyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouxufeiyongVO> selectListVO(Wrapper<ShouxufeiyongEntity> wrapper);
   	
   	ShouxufeiyongVO selectVO(@Param("ew") Wrapper<ShouxufeiyongEntity> wrapper);
   	
   	List<ShouxufeiyongView> selectListView(Wrapper<ShouxufeiyongEntity> wrapper);
   	
   	ShouxufeiyongView selectView(@Param("ew") Wrapper<ShouxufeiyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouxufeiyongEntity> wrapper);
   	
}

