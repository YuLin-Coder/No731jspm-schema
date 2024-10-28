package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhanghaojiaoyijiluDao;
import com.entity.ZhanghaojiaoyijiluEntity;
import com.service.ZhanghaojiaoyijiluService;
import com.entity.vo.ZhanghaojiaoyijiluVO;
import com.entity.view.ZhanghaojiaoyijiluView;

@Service("zhanghaojiaoyijiluService")
public class ZhanghaojiaoyijiluServiceImpl extends ServiceImpl<ZhanghaojiaoyijiluDao, ZhanghaojiaoyijiluEntity> implements ZhanghaojiaoyijiluService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhanghaojiaoyijiluEntity> page = this.selectPage(
                new Query<ZhanghaojiaoyijiluEntity>(params).getPage(),
                new EntityWrapper<ZhanghaojiaoyijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhanghaojiaoyijiluEntity> wrapper) {
		  Page<ZhanghaojiaoyijiluView> page =new Query<ZhanghaojiaoyijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhanghaojiaoyijiluVO> selectListVO(Wrapper<ZhanghaojiaoyijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhanghaojiaoyijiluVO selectVO(Wrapper<ZhanghaojiaoyijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhanghaojiaoyijiluView> selectListView(Wrapper<ZhanghaojiaoyijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhanghaojiaoyijiluView selectView(Wrapper<ZhanghaojiaoyijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
