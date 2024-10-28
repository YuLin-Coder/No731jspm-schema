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


import com.dao.DiscussyouxizhanghaoDao;
import com.entity.DiscussyouxizhanghaoEntity;
import com.service.DiscussyouxizhanghaoService;
import com.entity.vo.DiscussyouxizhanghaoVO;
import com.entity.view.DiscussyouxizhanghaoView;

@Service("discussyouxizhanghaoService")
public class DiscussyouxizhanghaoServiceImpl extends ServiceImpl<DiscussyouxizhanghaoDao, DiscussyouxizhanghaoEntity> implements DiscussyouxizhanghaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouxizhanghaoEntity> page = this.selectPage(
                new Query<DiscussyouxizhanghaoEntity>(params).getPage(),
                new EntityWrapper<DiscussyouxizhanghaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouxizhanghaoEntity> wrapper) {
		  Page<DiscussyouxizhanghaoView> page =new Query<DiscussyouxizhanghaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyouxizhanghaoVO> selectListVO(Wrapper<DiscussyouxizhanghaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouxizhanghaoVO selectVO(Wrapper<DiscussyouxizhanghaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouxizhanghaoView> selectListView(Wrapper<DiscussyouxizhanghaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouxizhanghaoView selectView(Wrapper<DiscussyouxizhanghaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
