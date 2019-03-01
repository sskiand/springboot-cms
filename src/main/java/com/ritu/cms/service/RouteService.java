package com.ritu.cms.service;

import com.ritu.cms.response.Result;

public interface RouteService {
	Result getRouteByName(String name);
	
	Result pointLocatedLine(String location);
}
