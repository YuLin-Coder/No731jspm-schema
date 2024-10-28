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


import com.dao.ShouxufeiyongDao;
import com.entity.ShouxufeiyongEntity;
import com.service.ShouxufeiyongService;
import com.entity.vo.ShouxufeiyongVO;
import com.entity.view.ShouxufeiyongView;

@Service("shouxufeiyongService")
public class ShouxufeiyongServiceImpl extends ServiceImpl<ShouxufeiyongDao, ShouxufeiyongEntity> implements ShouxufeiyongService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouxufeiyongEntity> page = this.selectPage(
                new Query<ShouxufeiyongEntity>(params).getPage(),
                new EntityWrapper<ShouxufeiyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouxufeiyongEntity> wrapper) {
		  Page<ShouxufeiyongView> page =new Query<ShouxufeiyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouxufeiyongVO> selectListVO(Wrapper<ShouxufeiyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouxufeiyongVO selectVO(Wrapper<ShouxufeiyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouxufeiyongView> selectListView(Wrapper<ShouxufeiyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouxufeiyongView selectView(Wrapper<ShouxufeiyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
