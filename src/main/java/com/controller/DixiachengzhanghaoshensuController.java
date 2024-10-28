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

import com.entity.DixiachengzhanghaoshensuEntity;
import com.entity.view.DixiachengzhanghaoshensuView;

import com.service.DixiachengzhanghaoshensuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 地下城账号申诉
 * 后端接口
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
@RestController
@RequestMapping("/dixiachengzhanghaoshensu")
public class DixiachengzhanghaoshensuController {
    @Autowired
    private DixiachengzhanghaoshensuService dixiachengzhanghaoshensuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DixiachengzhanghaoshensuEntity dixiachengzhanghaoshensu, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			dixiachengzhanghaoshensu.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DixiachengzhanghaoshensuEntity> ew = new EntityWrapper<DixiachengzhanghaoshensuEntity>();
    	PageUtils page = dixiachengzhanghaoshensuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dixiachengzhanghaoshensu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DixiachengzhanghaoshensuEntity dixiachengzhanghaoshensu, HttpServletRequest request){
        EntityWrapper<DixiachengzhanghaoshensuEntity> ew = new EntityWrapper<DixiachengzhanghaoshensuEntity>();
    	PageUtils page = dixiachengzhanghaoshensuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dixiachengzhanghaoshensu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DixiachengzhanghaoshensuEntity dixiachengzhanghaoshensu){
       	EntityWrapper<DixiachengzhanghaoshensuEntity> ew = new EntityWrapper<DixiachengzhanghaoshensuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dixiachengzhanghaoshensu, "dixiachengzhanghaoshensu")); 
        return R.ok().put("data", dixiachengzhanghaoshensuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DixiachengzhanghaoshensuEntity dixiachengzhanghaoshensu){
        EntityWrapper< DixiachengzhanghaoshensuEntity> ew = new EntityWrapper< DixiachengzhanghaoshensuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dixiachengzhanghaoshensu, "dixiachengzhanghaoshensu")); 
		DixiachengzhanghaoshensuView dixiachengzhanghaoshensuView =  dixiachengzhanghaoshensuService.selectView(ew);
		return R.ok("查询地下城账号申诉成功").put("data", dixiachengzhanghaoshensuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        DixiachengzhanghaoshensuEntity dixiachengzhanghaoshensu = dixiachengzhanghaoshensuService.selectById(id);
        return R.ok().put("data", dixiachengzhanghaoshensu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        DixiachengzhanghaoshensuEntity dixiachengzhanghaoshensu = dixiachengzhanghaoshensuService.selectById(id);
        return R.ok().put("data", dixiachengzhanghaoshensu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DixiachengzhanghaoshensuEntity dixiachengzhanghaoshensu, HttpServletRequest request){
    	dixiachengzhanghaoshensu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dixiachengzhanghaoshensu);

        dixiachengzhanghaoshensuService.insert(dixiachengzhanghaoshensu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DixiachengzhanghaoshensuEntity dixiachengzhanghaoshensu, HttpServletRequest request){
    	dixiachengzhanghaoshensu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dixiachengzhanghaoshensu);

        dixiachengzhanghaoshensuService.insert(dixiachengzhanghaoshensu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DixiachengzhanghaoshensuEntity dixiachengzhanghaoshensu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dixiachengzhanghaoshensu);
        dixiachengzhanghaoshensuService.updateById(dixiachengzhanghaoshensu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dixiachengzhanghaoshensuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DixiachengzhanghaoshensuEntity> wrapper = new EntityWrapper<DixiachengzhanghaoshensuEntity>();
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

		int count = dixiachengzhanghaoshensuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
