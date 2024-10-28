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


import com.dao.YingxionglianmengDao;
import com.entity.YingxionglianmengEntity;
import com.service.YingxionglianmengService;
import com.entity.vo.YingxionglianmengVO;
import com.entity.view.YingxionglianmengView;

@Service("yingxionglianmengService")
public class YingxionglianmengServiceImpl extends ServiceImpl<YingxionglianmengDao, YingxionglianmengEntity> implements YingxionglianmengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingxionglianmengEntity> page = this.selectPage(
                new Query<YingxionglianmengEntity>(params).getPage(),
                new EntityWrapper<YingxionglianmengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingxionglianmengEntity> wrapper) {
		  Page<YingxionglianmengView> page =new Query<YingxionglianmengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingxionglianmengVO> selectListVO(Wrapper<YingxionglianmengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingxionglianmengVO selectVO(Wrapper<YingxionglianmengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingxionglianmengView> selectListView(Wrapper<YingxionglianmengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingxionglianmengView selectView(Wrapper<YingxionglianmengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
