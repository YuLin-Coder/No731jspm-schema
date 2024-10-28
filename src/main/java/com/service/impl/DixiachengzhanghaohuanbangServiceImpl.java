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


import com.dao.DixiachengzhanghaohuanbangDao;
import com.entity.DixiachengzhanghaohuanbangEntity;
import com.service.DixiachengzhanghaohuanbangService;
import com.entity.vo.DixiachengzhanghaohuanbangVO;
import com.entity.view.DixiachengzhanghaohuanbangView;

@Service("dixiachengzhanghaohuanbangService")
public class DixiachengzhanghaohuanbangServiceImpl extends ServiceImpl<DixiachengzhanghaohuanbangDao, DixiachengzhanghaohuanbangEntity> implements DixiachengzhanghaohuanbangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DixiachengzhanghaohuanbangEntity> page = this.selectPage(
                new Query<DixiachengzhanghaohuanbangEntity>(params).getPage(),
                new EntityWrapper<DixiachengzhanghaohuanbangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DixiachengzhanghaohuanbangEntity> wrapper) {
		  Page<DixiachengzhanghaohuanbangView> page =new Query<DixiachengzhanghaohuanbangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DixiachengzhanghaohuanbangVO> selectListVO(Wrapper<DixiachengzhanghaohuanbangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DixiachengzhanghaohuanbangVO selectVO(Wrapper<DixiachengzhanghaohuanbangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DixiachengzhanghaohuanbangView> selectListView(Wrapper<DixiachengzhanghaohuanbangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DixiachengzhanghaohuanbangView selectView(Wrapper<DixiachengzhanghaohuanbangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
