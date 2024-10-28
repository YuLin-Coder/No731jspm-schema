package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.SixinliaotianhuifuEntity;
import com.entity.view.SixinliaotianhuifuView;

import com.service.SixinliaotianhuifuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 私信聊天回复
 * 后端接口
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
@RestController
@RequestMapping("/sixinliaotianhuifu")
public class SixinliaotianhuifuController {
    @Autowired
    private SixinliaotianhuifuService sixinliaotianhuifuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SixinliaotianhuifuEntity sixinliaotianhuifu, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("maijia")) {
			sixinliaotianhuifu.setMaijiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			sixinliaotianhuifu.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<SixinliaotianhuifuEntity> ew = new EntityWrapper<SixinliaotianhuifuEntity>();
    	PageUtils page = sixinliaotianhuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sixinliaotianhuifu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SixinliaotianhuifuEntity sixinliaotianhuifu, HttpServletRequest request){
        EntityWrapper<SixinliaotianhuifuEntity> ew = new EntityWrapper<SixinliaotianhuifuEntity>();
    	PageUtils page = sixinliaotianhuifuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, sixinliaotianhuifu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SixinliaotianhuifuEntity sixinliaotianhuifu){
       	EntityWrapper<SixinliaotianhuifuEntity> ew = new EntityWrapper<SixinliaotianhuifuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( sixinliaotianhuifu, "sixinliaotianhuifu")); 
        return R.ok().put("data", sixinliaotianhuifuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SixinliaotianhuifuEntity sixinliaotianhuifu){
        EntityWrapper< SixinliaotianhuifuEntity> ew = new EntityWrapper< SixinliaotianhuifuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( sixinliaotianhuifu, "sixinliaotianhuifu")); 
		SixinliaotianhuifuView sixinliaotianhuifuView =  sixinliaotianhuifuService.selectView(ew);
		return R.ok("查询私信聊天回复成功").put("data", sixinliaotianhuifuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        SixinliaotianhuifuEntity sixinliaotianhuifu = sixinliaotianhuifuService.selectById(id);
        return R.ok().put("data", sixinliaotianhuifu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        SixinliaotianhuifuEntity sixinliaotianhuifu = sixinliaotianhuifuService.selectById(id);
        return R.ok().put("data", sixinliaotianhuifu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SixinliaotianhuifuEntity sixinliaotianhuifu, HttpServletRequest request){
    	sixinliaotianhuifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sixinliaotianhuifu);

        sixinliaotianhuifuService.insert(sixinliaotianhuifu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SixinliaotianhuifuEntity sixinliaotianhuifu, HttpServletRequest request){
    	sixinliaotianhuifu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(sixinliaotianhuifu);

        sixinliaotianhuifuService.insert(sixinliaotianhuifu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SixinliaotianhuifuEntity sixinliaotianhuifu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(sixinliaotianhuifu);
        sixinliaotianhuifuService.updateById(sixinliaotianhuifu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        sixinliaotianhuifuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<SixinliaotianhuifuEntity> wrapper = new EntityWrapper<SixinliaotianhuifuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("maijia")) {
			wrapper.eq("maijiazhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = sixinliaotianhuifuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
