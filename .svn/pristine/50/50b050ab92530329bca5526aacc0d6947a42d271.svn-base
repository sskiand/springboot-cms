package com.ritu.cms.serviceImpl;

import org.springframework.stereotype.Service;

import com.ritu.cms.base.dao.impl.BaseDaoImpl;
import com.ritu.cms.base.where.Symbol;
import com.ritu.cms.base.where.Where;
import com.ritu.cms.constant.ConstantResponse;
import com.ritu.cms.pojo.TestDO;
import com.ritu.cms.response.Result;
import com.ritu.cms.service.TestService;

@Service
public class TestServiceImpl extends BaseDaoImpl<TestDO> implements TestService {

	@Override
	public Result getList() {
		Result res = new Result(ConstantResponse.OK_STATUS, ConstantResponse.OK_MSG);
		Where where = new Where();
		where.like(Symbol.AND, "name", "测试"); //模糊查询，等于： and name like "%测试%";
//		where.eq(Symbol.OR, "name", "测试", String.class); //精确查询，等于：or name = "测试";
//		where.eq(Symbol.OR, "id", 1, null); //精确查询，等于：or id = 1;
//		where.eq(Symbol.AND, "id", 1, null).eq(Symbol.AND, id, 2, null); //多条件拼接，等于：or id = 1 and id = 2;
//		where.in(Symbol.AND, "street", street, String.class); //包含查询，等于：and street in ('荷光路','光明路'), street = "荷光路 ,光明路"
//		where.in(Symbol.AND, "id", ids, null); //包含查询，等于：and id in (1, 2, 3, 4, 5), ids = "1, 2, 3, 4, 5"
//		where.isNull(Symbol.AND, "name"); //字段为空，等于：and name is null
		where.limit(0, 10); //分页 
		res.setResult(list(where)); 
		res.setTotal(count(where));
		return res;
	}

	@Override
	public Result add() {
		Result res = new Result(ConstantResponse.OK_STATUS, ConstantResponse.OK_MSG);
		TestDO test = new TestDO();
		test.setName("测试");
		add(test);
		return res;
	}
}
