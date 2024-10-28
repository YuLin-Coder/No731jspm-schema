package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DixiachengzhanghaohuanbangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DixiachengzhanghaohuanbangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DixiachengzhanghaohuanbangView;


/**
 * 地下城账号换绑
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface DixiachengzhanghaohuanbangService extends IService<DixiachengzhanghaohuanbangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DixiachengzhanghaohuanbangVO> selectListVO(Wrapper<DixiachengzhanghaohuanbangEntity> wrapper);
   	
   	DixiachengzhanghaohuanbangVO selectVO(@Param("ew") Wrapper<DixiachengzhanghaohuanbangEntity> wrapper);
   	
   	List<DixiachengzhanghaohuanbangView> selectListView(Wrapper<DixiachengzhanghaohuanbangEntity> wrapper);
   	
   	DixiachengzhanghaohuanbangView selectView(@Param("ew") Wrapper<DixiachengzhanghaohuanbangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DixiachengzhanghaohuanbangEntity> wrapper);
   	
}

