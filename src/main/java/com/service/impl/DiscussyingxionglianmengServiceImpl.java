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


import com.dao.DiscussyingxionglianmengDao;
import com.entity.DiscussyingxionglianmengEntity;
import com.service.DiscussyingxionglianmengService;
import com.entity.vo.DiscussyingxionglianmengVO;
import com.entity.view.DiscussyingxionglianmengView;

@Service("discussyingxionglianmengService")
public class DiscussyingxionglianmengServiceImpl extends ServiceImpl<DiscussyingxionglianmengDao, DiscussyingxionglianmengEntity> implements DiscussyingxionglianmengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyingxionglianmengEntity> page = this.selectPage(
                new Query<DiscussyingxionglianmengEntity>(params).getPage(),
                new EntityWrapper<DiscussyingxionglianmengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyingxionglianmengEntity> wrapper) {
		  Page<DiscussyingxionglianmengView> page =new Query<DiscussyingxionglianmengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyingxionglianmengVO> selectListVO(Wrapper<DiscussyingxionglianmengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyingxionglianmengVO selectVO(Wrapper<DiscussyingxionglianmengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyingxionglianmengView> selectListView(Wrapper<DiscussyingxionglianmengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyingxionglianmengView selectView(Wrapper<DiscussyingxionglianmengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
