package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DixiachengzhanghaogoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DixiachengzhanghaogoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DixiachengzhanghaogoumaiView;


/**
 * 地下城账号购买
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
public interface DixiachengzhanghaogoumaiService extends IService<DixiachengzhanghaogoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DixiachengzhanghaogoumaiVO> selectListVO(Wrapper<DixiachengzhanghaogoumaiEntity> wrapper);
   	
   	DixiachengzhanghaogoumaiVO selectVO(@Param("ew") Wrapper<DixiachengzhanghaogoumaiEntity> wrapper);
   	
   	List<DixiachengzhanghaogoumaiView> selectListView(Wrapper<DixiachengzhanghaogoumaiEntity> wrapper);
   	
   	DixiachengzhanghaogoumaiView selectView(@Param("ew") Wrapper<DixiachengzhanghaogoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DixiachengzhanghaogoumaiEntity> wrapper);
   	
}

