package com.ritu.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ritu.cms.base.vo.Res;
import com.ritu.cms.common.utils.CommonUtils;
import com.ritu.cms.service.RouteService;

@RestController
public class RouteController {
	
	@Autowired
	private RouteService routeService;
	
	/**
	 * 
	 * 方法名：<br>
	 * 描述：根据名称搜索道路信息<br>
	 * 创建时间：2019年2月25日 下午3:03:41<br>
	 * @author 阮建钧<br>
	 * @param name
	 * @return<br>
	 */
	@ResponseBody
	@RequestMapping("/select_route/v2/{name}")
	public String getRouteByName(@PathVariable String name){
		return CommonUtils.filterNullToResponse(routeService.getRouteByName(name), Res.JSON.getType());
	}
	
	/**
	 * 
	 * 方法名：<br>
	 * 描述：根据坐标点搜索道路信息<br>
	 * 创建时间：2019年2月25日 下午3:04:20<br>
	 * @author 阮建钧<br>
	 * @param location
	 * @return<br>
	 */
	@ResponseBody
	@RequestMapping("/point_located_line/v2")
	public String pointLocatedLine(String location){
		return CommonUtils.filterNullToResponse(routeService.pointLocatedLine(location), Res.JSON.getType());
	}
}
