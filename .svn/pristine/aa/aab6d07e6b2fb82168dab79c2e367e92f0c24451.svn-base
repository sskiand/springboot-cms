package com.ritu.cms.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ritu.cms.base.dao.impl.BaseDaoImpl;
import com.ritu.cms.base.where.Symbol;
import com.ritu.cms.base.where.Where;
import com.ritu.cms.common.utils.CommonUtils;
import com.ritu.cms.constant.ConstantResponse;
import com.ritu.cms.pojo.RouteDO;
import com.ritu.cms.response.Result;
import com.ritu.cms.service.RouteService;

@Service
public class RouteServiceImpl extends BaseDaoImpl<RouteDO> implements RouteService {

	@Override
	public Result getRouteByName(String name) {
		Result res = new Result(ConstantResponse.OK_STATUS, ConstantResponse.OK_MSG);
		if (CommonUtils.isNotEmptry(name)) {
			Where where = new Where();
			where.eq(Symbol.AND, "name", name, String.class);
			res.setTotal(count(where));
			res.setResult(list(where));
		}
		return res;
	}

	@Override
	public Result pointLocatedLine(String location) {
		Result res = new Result(ConstantResponse.OK_STATUS, ConstantResponse.OK_MSG);
		if (CommonUtils.isNotEmptry(location)) {
			Where where = new Where();
			where.pointLocatedLine(Symbol.AND, location);
			List<RouteDO> list = list(where);
			if (list != null && list.size() > 0) {
				return getRouteByName(list.get(0).getName());
			}
		}
		return res;
	}
}
