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


import com.dao.YingxionglianmenghuanbangDao;
import com.entity.YingxionglianmenghuanbangEntity;
import com.service.YingxionglianmenghuanbangService;
import com.entity.vo.YingxionglianmenghuanbangVO;
import com.entity.view.YingxionglianmenghuanbangView;

@Service("yingxionglianmenghuanbangService")
public class YingxionglianmenghuanbangServiceImpl extends ServiceImpl<YingxionglianmenghuanbangDao, YingxionglianmenghuanbangEntity> implements YingxionglianmenghuanbangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingxionglianmenghuanbangEntity> page = this.selectPage(
                new Query<YingxionglianmenghuanbangEntity>(params).getPage(),
                new EntityWrapper<YingxionglianmenghuanbangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingxionglianmenghuanbangEntity> wrapper) {
		  Page<YingxionglianmenghuanbangView> page =new Query<YingxionglianmenghuanbangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingxionglianmenghuanbangVO> selectListVO(Wrapper<YingxionglianmenghuanbangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingxionglianmenghuanbangVO selectVO(Wrapper<YingxionglianmenghuanbangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingxionglianmenghuanbangView> selectListView(Wrapper<YingxionglianmenghuanbangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingxionglianmenghuanbangView selectView(Wrapper<YingxionglianmenghuanbangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
