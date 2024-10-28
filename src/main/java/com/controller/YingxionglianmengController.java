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

import com.entity.YingxionglianmengEntity;
import com.entity.view.YingxionglianmengView;

import com.service.YingxionglianmengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 英雄联盟
 * 后端接口
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
@RestController
@RequestMapping("/yingxionglianmeng")
public class YingxionglianmengController {
    @Autowired
    private YingxionglianmengService yingxionglianmengService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YingxionglianmengEntity yingxionglianmeng, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("maijia")) {
			yingxionglianmeng.setMaijiazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YingxionglianmengEntity> ew = new EntityWrapper<YingxionglianmengEntity>();
    	PageUtils page = yingxionglianmengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingxionglianmeng), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YingxionglianmengEntity yingxionglianmeng, HttpServletRequest request){
        EntityWrapper<YingxionglianmengEntity> ew = new EntityWrapper<YingxionglianmengEntity>();
    	PageUtils page = yingxionglianmengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingxionglianmeng), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YingxionglianmengEntity yingxionglianmeng){
       	EntityWrapper<YingxionglianmengEntity> ew = new EntityWrapper<YingxionglianmengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yingxionglianmeng, "yingxionglianmeng")); 
        return R.ok().put("data", yingxionglianmengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YingxionglianmengEntity yingxionglianmeng){
        EntityWrapper< YingxionglianmengEntity> ew = new EntityWrapper< YingxionglianmengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yingxionglianmeng, "yingxionglianmeng")); 
		YingxionglianmengView yingxionglianmengView =  yingxionglianmengService.selectView(ew);
		return R.ok("查询英雄联盟成功").put("data", yingxionglianmengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        YingxionglianmengEntity yingxionglianmeng = yingxionglianmengService.selectById(id);
        return R.ok().put("data", yingxionglianmeng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        YingxionglianmengEntity yingxionglianmeng = yingxionglianmengService.selectById(id);
        return R.ok().put("data", yingxionglianmeng);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        YingxionglianmengEntity yingxionglianmeng = yingxionglianmengService.selectById(id);
        if(type.equals("1")) {
        	yingxionglianmeng.setThumbsupnum(yingxionglianmeng.getThumbsupnum()+1);
        } else {
        	yingxionglianmeng.setCrazilynum(yingxionglianmeng.getCrazilynum()+1);
        }
        yingxionglianmengService.updateById(yingxionglianmeng);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YingxionglianmengEntity yingxionglianmeng, HttpServletRequest request){
    	yingxionglianmeng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yingxionglianmeng);

        yingxionglianmengService.insert(yingxionglianmeng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YingxionglianmengEntity yingxionglianmeng, HttpServletRequest request){
    	yingxionglianmeng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yingxionglianmeng);

        yingxionglianmengService.insert(yingxionglianmeng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YingxionglianmengEntity yingxionglianmeng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yingxionglianmeng);
        yingxionglianmengService.updateById(yingxionglianmeng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yingxionglianmengService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YingxionglianmengEntity> wrapper = new EntityWrapper<YingxionglianmengEntity>();
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

		int count = yingxionglianmengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
