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


import com.dao.YouxizhanghaohuanbangDao;
import com.entity.YouxizhanghaohuanbangEntity;
import com.service.YouxizhanghaohuanbangService;
import com.entity.vo.YouxizhanghaohuanbangVO;
import com.entity.view.YouxizhanghaohuanbangView;

@Service("youxizhanghaohuanbangService")
public class YouxizhanghaohuanbangServiceImpl extends ServiceImpl<YouxizhanghaohuanbangDao, YouxizhanghaohuanbangEntity> implements YouxizhanghaohuanbangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxizhanghaohuanbangEntity> page = this.selectPage(
                new Query<YouxizhanghaohuanbangEntity>(params).getPage(),
                new EntityWrapper<YouxizhanghaohuanbangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxizhanghaohuanbangEntity> wrapper) {
		  Page<YouxizhanghaohuanbangView> page =new Query<YouxizhanghaohuanbangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxizhanghaohuanbangVO> selectListVO(Wrapper<YouxizhanghaohuanbangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxizhanghaohuanbangVO selectVO(Wrapper<YouxizhanghaohuanbangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxizhanghaohuanbangView> selectListView(Wrapper<YouxizhanghaohuanbangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxizhanghaohuanbangView selectView(Wrapper<YouxizhanghaohuanbangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
