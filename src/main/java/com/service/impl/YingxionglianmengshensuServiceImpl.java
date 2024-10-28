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


import com.dao.YingxionglianmengshensuDao;
import com.entity.YingxionglianmengshensuEntity;
import com.service.YingxionglianmengshensuService;
import com.entity.vo.YingxionglianmengshensuVO;
import com.entity.view.YingxionglianmengshensuView;

@Service("yingxionglianmengshensuService")
public class YingxionglianmengshensuServiceImpl extends ServiceImpl<YingxionglianmengshensuDao, YingxionglianmengshensuEntity> implements YingxionglianmengshensuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingxionglianmengshensuEntity> page = this.selectPage(
                new Query<YingxionglianmengshensuEntity>(params).getPage(),
                new EntityWrapper<YingxionglianmengshensuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingxionglianmengshensuEntity> wrapper) {
		  Page<YingxionglianmengshensuView> page =new Query<YingxionglianmengshensuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingxionglianmengshensuVO> selectListVO(Wrapper<YingxionglianmengshensuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingxionglianmengshensuVO selectVO(Wrapper<YingxionglianmengshensuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingxionglianmengshensuView> selectListView(Wrapper<YingxionglianmengshensuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingxionglianmengshensuView selectView(Wrapper<YingxionglianmengshensuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
