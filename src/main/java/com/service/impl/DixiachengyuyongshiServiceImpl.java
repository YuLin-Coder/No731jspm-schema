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


import com.dao.DixiachengyuyongshiDao;
import com.entity.DixiachengyuyongshiEntity;
import com.service.DixiachengyuyongshiService;
import com.entity.vo.DixiachengyuyongshiVO;
import com.entity.view.DixiachengyuyongshiView;

@Service("dixiachengyuyongshiService")
public class DixiachengyuyongshiServiceImpl extends ServiceImpl<DixiachengyuyongshiDao, DixiachengyuyongshiEntity> implements DixiachengyuyongshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DixiachengyuyongshiEntity> page = this.selectPage(
                new Query<DixiachengyuyongshiEntity>(params).getPage(),
                new EntityWrapper<DixiachengyuyongshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DixiachengyuyongshiEntity> wrapper) {
		  Page<DixiachengyuyongshiView> page =new Query<DixiachengyuyongshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DixiachengyuyongshiVO> selectListVO(Wrapper<DixiachengyuyongshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DixiachengyuyongshiVO selectVO(Wrapper<DixiachengyuyongshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DixiachengyuyongshiView> selectListView(Wrapper<DixiachengyuyongshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DixiachengyuyongshiView selectView(Wrapper<DixiachengyuyongshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
