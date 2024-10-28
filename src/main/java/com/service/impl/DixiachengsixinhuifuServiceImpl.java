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


import com.dao.DixiachengsixinhuifuDao;
import com.entity.DixiachengsixinhuifuEntity;
import com.service.DixiachengsixinhuifuService;
import com.entity.vo.DixiachengsixinhuifuVO;
import com.entity.view.DixiachengsixinhuifuView;

@Service("dixiachengsixinhuifuService")
public class DixiachengsixinhuifuServiceImpl extends ServiceImpl<DixiachengsixinhuifuDao, DixiachengsixinhuifuEntity> implements DixiachengsixinhuifuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DixiachengsixinhuifuEntity> page = this.selectPage(
                new Query<DixiachengsixinhuifuEntity>(params).getPage(),
                new EntityWrapper<DixiachengsixinhuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DixiachengsixinhuifuEntity> wrapper) {
		  Page<DixiachengsixinhuifuView> page =new Query<DixiachengsixinhuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DixiachengsixinhuifuVO> selectListVO(Wrapper<DixiachengsixinhuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DixiachengsixinhuifuVO selectVO(Wrapper<DixiachengsixinhuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DixiachengsixinhuifuView> selectListView(Wrapper<DixiachengsixinhuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DixiachengsixinhuifuView selectView(Wrapper<DixiachengsixinhuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
