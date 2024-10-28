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


import com.dao.YingxionglianmenggoumaiDao;
import com.entity.YingxionglianmenggoumaiEntity;
import com.service.YingxionglianmenggoumaiService;
import com.entity.vo.YingxionglianmenggoumaiVO;
import com.entity.view.YingxionglianmenggoumaiView;

@Service("yingxionglianmenggoumaiService")
public class YingxionglianmenggoumaiServiceImpl extends ServiceImpl<YingxionglianmenggoumaiDao, YingxionglianmenggoumaiEntity> implements YingxionglianmenggoumaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingxionglianmenggoumaiEntity> page = this.selectPage(
                new Query<YingxionglianmenggoumaiEntity>(params).getPage(),
                new EntityWrapper<YingxionglianmenggoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingxionglianmenggoumaiEntity> wrapper) {
		  Page<YingxionglianmenggoumaiView> page =new Query<YingxionglianmenggoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingxionglianmenggoumaiVO> selectListVO(Wrapper<YingxionglianmenggoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingxionglianmenggoumaiVO selectVO(Wrapper<YingxionglianmenggoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingxionglianmenggoumaiView> selectListView(Wrapper<YingxionglianmenggoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingxionglianmenggoumaiView selectView(Wrapper<YingxionglianmenggoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
