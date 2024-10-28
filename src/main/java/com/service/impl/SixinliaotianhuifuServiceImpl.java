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


import com.dao.SixinliaotianhuifuDao;
import com.entity.SixinliaotianhuifuEntity;
import com.service.SixinliaotianhuifuService;
import com.entity.vo.SixinliaotianhuifuVO;
import com.entity.view.SixinliaotianhuifuView;

@Service("sixinliaotianhuifuService")
public class SixinliaotianhuifuServiceImpl extends ServiceImpl<SixinliaotianhuifuDao, SixinliaotianhuifuEntity> implements SixinliaotianhuifuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SixinliaotianhuifuEntity> page = this.selectPage(
                new Query<SixinliaotianhuifuEntity>(params).getPage(),
                new EntityWrapper<SixinliaotianhuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SixinliaotianhuifuEntity> wrapper) {
		  Page<SixinliaotianhuifuView> page =new Query<SixinliaotianhuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SixinliaotianhuifuVO> selectListVO(Wrapper<SixinliaotianhuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SixinliaotianhuifuVO selectVO(Wrapper<SixinliaotianhuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SixinliaotianhuifuView> selectListView(Wrapper<SixinliaotianhuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SixinliaotianhuifuView selectView(Wrapper<SixinliaotianhuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
