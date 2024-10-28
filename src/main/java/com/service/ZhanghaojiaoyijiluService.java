package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhanghaojiaoyijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhanghaojiaoyijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhanghaojiaoyijiluView;


/**
 * 账号交易记录
 *
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
public interface ZhanghaojiaoyijiluService extends IService<ZhanghaojiaoyijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhanghaojiaoyijiluVO> selectListVO(Wrapper<ZhanghaojiaoyijiluEntity> wrapper);
   	
   	ZhanghaojiaoyijiluVO selectVO(@Param("ew") Wrapper<ZhanghaojiaoyijiluEntity> wrapper);
   	
   	List<ZhanghaojiaoyijiluView> selectListView(Wrapper<ZhanghaojiaoyijiluEntity> wrapper);
   	
   	ZhanghaojiaoyijiluView selectView(@Param("ew") Wrapper<ZhanghaojiaoyijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhanghaojiaoyijiluEntity> wrapper);
   	
}

