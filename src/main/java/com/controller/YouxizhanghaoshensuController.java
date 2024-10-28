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

import com.entity.YouxizhanghaoshensuEntity;
import com.entity.view.YouxizhanghaoshensuView;

import com.service.YouxizhanghaoshensuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 游戏账号申诉
 * 后端接口
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
@RestController
@RequestMapping("/youxizhanghaoshensu")
public class YouxizhanghaoshensuController {
    @Autowired
    private YouxizhanghaoshensuService youxizhanghaoshensuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YouxizhanghaoshensuEntity youxizhanghaoshensu, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			youxizhanghaoshensu.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YouxizhanghaoshensuEntity> ew = new EntityWrapper<YouxizhanghaoshensuEntity>();
    	PageUtils page = youxizhanghaoshensuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxizhanghaoshensu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YouxizhanghaoshensuEntity youxizhanghaoshensu, HttpServletRequest request){
        EntityWrapper<YouxizhanghaoshensuEntity> ew = new EntityWrapper<YouxizhanghaoshensuEntity>();
    	PageUtils page = youxizhanghaoshensuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxizhanghaoshensu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YouxizhanghaoshensuEntity youxizhanghaoshensu){
       	EntityWrapper<YouxizhanghaoshensuEntity> ew = new EntityWrapper<YouxizhanghaoshensuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( youxizhanghaoshensu, "youxizhanghaoshensu")); 
        return R.ok().put("data", youxizhanghaoshensuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YouxizhanghaoshensuEntity youxizhanghaoshensu){
        EntityWrapper< YouxizhanghaoshensuEntity> ew = new EntityWrapper< YouxizhanghaoshensuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( youxizhanghaoshensu, "youxizhanghaoshensu")); 
		YouxizhanghaoshensuView youxizhanghaoshensuView =  youxizhanghaoshensuService.selectView(ew);
		return R.ok("查询游戏账号申诉成功").put("data", youxizhanghaoshensuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        YouxizhanghaoshensuEntity youxizhanghaoshensu = youxizhanghaoshensuService.selectById(id);
        return R.ok().put("data", youxizhanghaoshensu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        YouxizhanghaoshensuEntity youxizhanghaoshensu = youxizhanghaoshensuService.selectById(id);
        return R.ok().put("data", youxizhanghaoshensu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YouxizhanghaoshensuEntity youxizhanghaoshensu, HttpServletRequest request){
    	youxizhanghaoshensu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youxizhanghaoshensu);

        youxizhanghaoshensuService.insert(youxizhanghaoshensu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YouxizhanghaoshensuEntity youxizhanghaoshensu, HttpServletRequest request){
    	youxizhanghaoshensu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youxizhanghaoshensu);

        youxizhanghaoshensuService.insert(youxizhanghaoshensu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YouxizhanghaoshensuEntity youxizhanghaoshensu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(youxizhanghaoshensu);
        youxizhanghaoshensuService.updateById(youxizhanghaoshensu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        youxizhanghaoshensuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YouxizhanghaoshensuEntity> wrapper = new EntityWrapper<YouxizhanghaoshensuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = youxizhanghaoshensuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
