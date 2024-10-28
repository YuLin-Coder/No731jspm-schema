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


import com.dao.DixiachengzhanghaoshensuDao;
import com.entity.DixiachengzhanghaoshensuEntity;
import com.service.DixiachengzhanghaoshensuService;
import com.entity.vo.DixiachengzhanghaoshensuVO;
import com.entity.view.DixiachengzhanghaoshensuView;

@Service("dixiachengzhanghaoshensuService")
public class DixiachengzhanghaoshensuServiceImpl extends ServiceImpl<DixiachengzhanghaoshensuDao, DixiachengzhanghaoshensuEntity> implements DixiachengzhanghaoshensuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DixiachengzhanghaoshensuEntity> page = this.selectPage(
                new Query<DixiachengzhanghaoshensuEntity>(params).getPage(),
                new EntityWrapper<DixiachengzhanghaoshensuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DixiachengzhanghaoshensuEntity> wrapper) {
		  Page<DixiachengzhanghaoshensuView> page =new Query<DixiachengzhanghaoshensuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DixiachengzhanghaoshensuVO> selectListVO(Wrapper<DixiachengzhanghaoshensuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DixiachengzhanghaoshensuVO selectVO(Wrapper<DixiachengzhanghaoshensuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DixiachengzhanghaoshensuView> selectListView(Wrapper<DixiachengzhanghaoshensuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DixiachengzhanghaoshensuView selectView(Wrapper<DixiachengzhanghaoshensuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
