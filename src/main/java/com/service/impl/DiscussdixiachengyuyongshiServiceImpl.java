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


import com.dao.DiscussdixiachengyuyongshiDao;
import com.entity.DiscussdixiachengyuyongshiEntity;
import com.service.DiscussdixiachengyuyongshiService;
import com.entity.vo.DiscussdixiachengyuyongshiVO;
import com.entity.view.DiscussdixiachengyuyongshiView;

@Service("discussdixiachengyuyongshiService")
public class DiscussdixiachengyuyongshiServiceImpl extends ServiceImpl<DiscussdixiachengyuyongshiDao, DiscussdixiachengyuyongshiEntity> implements DiscussdixiachengyuyongshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdixiachengyuyongshiEntity> page = this.selectPage(
                new Query<DiscussdixiachengyuyongshiEntity>(params).getPage(),
                new EntityWrapper<DiscussdixiachengyuyongshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdixiachengyuyongshiEntity> wrapper) {
		  Page<DiscussdixiachengyuyongshiView> page =new Query<DiscussdixiachengyuyongshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdixiachengyuyongshiVO> selectListVO(Wrapper<DiscussdixiachengyuyongshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdixiachengyuyongshiVO selectVO(Wrapper<DiscussdixiachengyuyongshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdixiachengyuyongshiView> selectListView(Wrapper<DiscussdixiachengyuyongshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdixiachengyuyongshiView selectView(Wrapper<DiscussdixiachengyuyongshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
