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


import com.dao.SixinliaotianjiluDao;
import com.entity.SixinliaotianjiluEntity;
import com.service.SixinliaotianjiluService;
import com.entity.vo.SixinliaotianjiluVO;
import com.entity.view.SixinliaotianjiluView;

@Service("sixinliaotianjiluService")
public class SixinliaotianjiluServiceImpl extends ServiceImpl<SixinliaotianjiluDao, SixinliaotianjiluEntity> implements SixinliaotianjiluService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SixinliaotianjiluEntity> page = this.selectPage(
                new Query<SixinliaotianjiluEntity>(params).getPage(),
                new EntityWrapper<SixinliaotianjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SixinliaotianjiluEntity> wrapper) {
		  Page<SixinliaotianjiluView> page =new Query<SixinliaotianjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SixinliaotianjiluVO> selectListVO(Wrapper<SixinliaotianjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SixinliaotianjiluVO selectVO(Wrapper<SixinliaotianjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SixinliaotianjiluView> selectListView(Wrapper<SixinliaotianjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SixinliaotianjiluView selectView(Wrapper<SixinliaotianjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
