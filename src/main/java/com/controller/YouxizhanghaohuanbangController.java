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

import com.entity.YouxizhanghaohuanbangEntity;
import com.entity.view.YouxizhanghaohuanbangView;

import com.service.YouxizhanghaohuanbangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 游戏账号换绑
 * 后端接口
 * @author 
 * @email 
 * @date 2020-10-21 09:13:15
 */
@RestController
@RequestMapping("/youxizhanghaohuanbang")
public class YouxizhanghaohuanbangController {
    @Autowired
    private YouxizhanghaohuanbangService youxizhanghaohuanbangService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YouxizhanghaohuanbangEntity youxizhanghaohuanbang, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("maijia")) {
			youxizhanghaohuanbang.setMaijiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			youxizhanghaohuanbang.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YouxizhanghaohuanbangEntity> ew = new EntityWrapper<YouxizhanghaohuanbangEntity>();
    	PageUtils page = youxizhanghaohuanbangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxizhanghaohuanbang), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YouxizhanghaohuanbangEntity youxizhanghaohuanbang, HttpServletRequest request){
        EntityWrapper<YouxizhanghaohuanbangEntity> ew = new EntityWrapper<YouxizhanghaohuanbangEntity>();
    	PageUtils page = youxizhanghaohuanbangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxizhanghaohuanbang), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YouxizhanghaohuanbangEntity youxizhanghaohuanbang){
       	EntityWrapper<YouxizhanghaohuanbangEntity> ew = new EntityWrapper<YouxizhanghaohuanbangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( youxizhanghaohuanbang, "youxizhanghaohuanbang")); 
        return R.ok().put("data", youxizhanghaohuanbangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YouxizhanghaohuanbangEntity youxizhanghaohuanbang){
        EntityWrapper< YouxizhanghaohuanbangEntity> ew = new EntityWrapper< YouxizhanghaohuanbangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( youxizhanghaohuanbang, "youxizhanghaohuanbang")); 
		YouxizhanghaohuanbangView youxizhanghaohuanbangView =  youxizhanghaohuanbangService.selectView(ew);
		return R.ok("查询游戏账号换绑成功").put("data", youxizhanghaohuanbangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        YouxizhanghaohuanbangEntity youxizhanghaohuanbang = youxizhanghaohuanbangService.selectById(id);
        return R.ok().put("data", youxizhanghaohuanbang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        YouxizhanghaohuanbangEntity youxizhanghaohuanbang = youxizhanghaohuanbangService.selectById(id);
        return R.ok().put("data", youxizhanghaohuanbang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YouxizhanghaohuanbangEntity youxizhanghaohuanbang, HttpServletRequest request){
    	youxizhanghaohuanbang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youxizhanghaohuanbang);

        youxizhanghaohuanbangService.insert(youxizhanghaohuanbang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YouxizhanghaohuanbangEntity youxizhanghaohuanbang, HttpServletRequest request){
    	youxizhanghaohuanbang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youxizhanghaohuanbang);

        youxizhanghaohuanbangService.insert(youxizhanghaohuanbang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YouxizhanghaohuanbangEntity youxizhanghaohuanbang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(youxizhanghaohuanbang);
        youxizhanghaohuanbangService.updateById(youxizhanghaohuanbang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        youxizhanghaohuanbangService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<YouxizhanghaohuanbangEntity> wrapper = new EntityWrapper<YouxizhanghaohuanbangEntity>();
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

		int count = youxizhanghaohuanbangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
