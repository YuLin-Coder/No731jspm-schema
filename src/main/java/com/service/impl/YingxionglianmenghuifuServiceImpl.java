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


import com.dao.YingxionglianmenghuifuDao;
import com.entity.YingxionglianmenghuifuEntity;
import com.service.YingxionglianmenghuifuService;
import com.entity.vo.YingxionglianmenghuifuVO;
import com.entity.view.YingxionglianmenghuifuView;

@Service("yingxionglianmenghuifuService")
public class YingxionglianmenghuifuServiceImpl extends ServiceImpl<YingxionglianmenghuifuDao, YingxionglianmenghuifuEntity> implements YingxionglianmenghuifuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingxionglianmenghuifuEntity> page = this.selectPage(
                new Query<YingxionglianmenghuifuEntity>(params).getPage(),
                new EntityWrapper<YingxionglianmenghuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingxionglianmenghuifuEntity> wrapper) {
		  Page<YingxionglianmenghuifuView> page =new Query<YingxionglianmenghuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingxionglianmenghuifuVO> selectListVO(Wrapper<YingxionglianmenghuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingxionglianmenghuifuVO selectVO(Wrapper<YingxionglianmenghuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingxionglianmenghuifuView> selectListView(Wrapper<YingxionglianmenghuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingxionglianmenghuifuView selectView(Wrapper<YingxionglianmenghuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
