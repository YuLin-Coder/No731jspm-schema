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


import com.dao.YingxionglianmengsixinDao;
import com.entity.YingxionglianmengsixinEntity;
import com.service.YingxionglianmengsixinService;
import com.entity.vo.YingxionglianmengsixinVO;
import com.entity.view.YingxionglianmengsixinView;

@Service("yingxionglianmengsixinService")
public class YingxionglianmengsixinServiceImpl extends ServiceImpl<YingxionglianmengsixinDao, YingxionglianmengsixinEntity> implements YingxionglianmengsixinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingxionglianmengsixinEntity> page = this.selectPage(
                new Query<YingxionglianmengsixinEntity>(params).getPage(),
                new EntityWrapper<YingxionglianmengsixinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingxionglianmengsixinEntity> wrapper) {
		  Page<YingxionglianmengsixinView> page =new Query<YingxionglianmengsixinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingxionglianmengsixinVO> selectListVO(Wrapper<YingxionglianmengsixinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingxionglianmengsixinVO selectVO(Wrapper<YingxionglianmengsixinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingxionglianmengsixinView> selectListView(Wrapper<YingxionglianmengsixinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingxionglianmengsixinView selectView(Wrapper<YingxionglianmengsixinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
