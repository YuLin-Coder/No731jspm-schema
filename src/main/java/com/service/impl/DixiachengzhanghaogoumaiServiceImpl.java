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


import com.dao.DixiachengzhanghaogoumaiDao;
import com.entity.DixiachengzhanghaogoumaiEntity;
import com.service.DixiachengzhanghaogoumaiService;
import com.entity.vo.DixiachengzhanghaogoumaiVO;
import com.entity.view.DixiachengzhanghaogoumaiView;

@Service("dixiachengzhanghaogoumaiService")
public class DixiachengzhanghaogoumaiServiceImpl extends ServiceImpl<DixiachengzhanghaogoumaiDao, DixiachengzhanghaogoumaiEntity> implements DixiachengzhanghaogoumaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DixiachengzhanghaogoumaiEntity> page = this.selectPage(
                new Query<DixiachengzhanghaogoumaiEntity>(params).getPage(),
                new EntityWrapper<DixiachengzhanghaogoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DixiachengzhanghaogoumaiEntity> wrapper) {
		  Page<DixiachengzhanghaogoumaiView> page =new Query<DixiachengzhanghaogoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DixiachengzhanghaogoumaiVO> selectListVO(Wrapper<DixiachengzhanghaogoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DixiachengzhanghaogoumaiVO selectVO(Wrapper<DixiachengzhanghaogoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DixiachengzhanghaogoumaiView> selectListView(Wrapper<DixiachengzhanghaogoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DixiachengzhanghaogoumaiView selectView(Wrapper<DixiachengzhanghaogoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
