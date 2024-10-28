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


import com.dao.DixiachengsixinliaotianDao;
import com.entity.DixiachengsixinliaotianEntity;
import com.service.DixiachengsixinliaotianService;
import com.entity.vo.DixiachengsixinliaotianVO;
import com.entity.view.DixiachengsixinliaotianView;

@Service("dixiachengsixinliaotianService")
public class DixiachengsixinliaotianServiceImpl extends ServiceImpl<DixiachengsixinliaotianDao, DixiachengsixinliaotianEntity> implements DixiachengsixinliaotianService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DixiachengsixinliaotianEntity> page = this.selectPage(
                new Query<DixiachengsixinliaotianEntity>(params).getPage(),
                new EntityWrapper<DixiachengsixinliaotianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DixiachengsixinliaotianEntity> wrapper) {
		  Page<DixiachengsixinliaotianView> page =new Query<DixiachengsixinliaotianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DixiachengsixinliaotianVO> selectListVO(Wrapper<DixiachengsixinliaotianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DixiachengsixinliaotianVO selectVO(Wrapper<DixiachengsixinliaotianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DixiachengsixinliaotianView> selectListView(Wrapper<DixiachengsixinliaotianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DixiachengsixinliaotianView selectView(Wrapper<DixiachengsixinliaotianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
