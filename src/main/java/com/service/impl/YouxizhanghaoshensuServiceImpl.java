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


import com.dao.YouxizhanghaoshensuDao;
import com.entity.YouxizhanghaoshensuEntity;
import com.service.YouxizhanghaoshensuService;
import com.entity.vo.YouxizhanghaoshensuVO;
import com.entity.view.YouxizhanghaoshensuView;

@Service("youxizhanghaoshensuService")
public class YouxizhanghaoshensuServiceImpl extends ServiceImpl<YouxizhanghaoshensuDao, YouxizhanghaoshensuEntity> implements YouxizhanghaoshensuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxizhanghaoshensuEntity> page = this.selectPage(
                new Query<YouxizhanghaoshensuEntity>(params).getPage(),
                new EntityWrapper<YouxizhanghaoshensuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxizhanghaoshensuEntity> wrapper) {
		  Page<YouxizhanghaoshensuView> page =new Query<YouxizhanghaoshensuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxizhanghaoshensuVO> selectListVO(Wrapper<YouxizhanghaoshensuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxizhanghaoshensuVO selectVO(Wrapper<YouxizhanghaoshensuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxizhanghaoshensuView> selectListView(Wrapper<YouxizhanghaoshensuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxizhanghaoshensuView selectView(Wrapper<YouxizhanghaoshensuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
