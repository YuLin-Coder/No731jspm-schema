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

import com.entity.DixiachengzhanghaogoumaiEntity;
import com.entity.view.DixiachengzhanghaogoumaiView;

import com.service.DixiachengzhanghaogoumaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 地下城账号购买
 * 后端接口
 * @author 
 * @email 
 * @date 2020-10-21 09:13:14
 */
@RestController
@RequestMapping("/dixiachengzhanghaogoumai")
public class DixiachengzhanghaogoumaiController {
    @Autowired
    private DixiachengzhanghaogoumaiService dixiachengzhanghaogoumaiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DixiachengzhanghaogoumaiEntity dixiachengzhanghaogoumai, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("maijia")) {
			dixiachengzhanghaogoumai.setMaijiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			dixiachengzhanghaogoumai.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DixiachengzhanghaogoumaiEntity> ew = new EntityWrapper<DixiachengzhanghaogoumaiEntity>();
    	PageUtils page = dixiachengzhanghaogoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dixiachengzhanghaogoumai), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DixiachengzhanghaogoumaiEntity dixiachengzhanghaogoumai, HttpServletRequest request){
        EntityWrapper<DixiachengzhanghaogoumaiEntity> ew = new EntityWrapper<DixiachengzhanghaogoumaiEntity>();
    	PageUtils page = dixiachengzhanghaogoumaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dixiachengzhanghaogoumai), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DixiachengzhanghaogoumaiEntity dixiachengzhanghaogoumai){
       	EntityWrapper<DixiachengzhanghaogoumaiEntity> ew = new EntityWrapper<DixiachengzhanghaogoumaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dixiachengzhanghaogoumai, "dixiachengzhanghaogoumai")); 
        return R.ok().put("data", dixiachengzhanghaogoumaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DixiachengzhanghaogoumaiEntity dixiachengzhanghaogoumai){
        EntityWrapper< DixiachengzhanghaogoumaiEntity> ew = new EntityWrapper< DixiachengzhanghaogoumaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dixiachengzhanghaogoumai, "dixiachengzhanghaogoumai")); 
		DixiachengzhanghaogoumaiView dixiachengzhanghaogoumaiView =  dixiachengzhanghaogoumaiService.selectView(ew);
		return R.ok("查询地下城账号购买成功").put("data", dixiachengzhanghaogoumaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        DixiachengzhanghaogoumaiEntity dixiachengzhanghaogoumai = dixiachengzhanghaogoumaiService.selectById(id);
        return R.ok().put("data", dixiachengzhanghaogoumai);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        DixiachengzhanghaogoumaiEntity dixiachengzhanghaogoumai = dixiachengzhanghaogoumaiService.selectById(id);
        return R.ok().put("data", dixiachengzhanghaogoumai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DixiachengzhanghaogoumaiEntity dixiachengzhanghaogoumai, HttpServletRequest request){
    	dixiachengzhanghaogoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dixiachengzhanghaogoumai);

        dixiachengzhanghaogoumaiService.insert(dixiachengzhanghaogoumai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DixiachengzhanghaogoumaiEntity dixiachengzhanghaogoumai, HttpServletRequest request){
    	dixiachengzhanghaogoumai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dixiachengzhanghaogoumai);

        dixiachengzhanghaogoumaiService.insert(dixiachengzhanghaogoumai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DixiachengzhanghaogoumaiEntity dixiachengzhanghaogoumai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dixiachengzhanghaogoumai);
        dixiachengzhanghaogoumaiService.updateById(dixiachengzhanghaogoumai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dixiachengzhanghaogoumaiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DixiachengzhanghaogoumaiEntity> wrapper = new EntityWrapper<DixiachengzhanghaogoumaiEntity>();
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

		int count = dixiachengzhanghaogoumaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
