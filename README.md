介绍

这是我最近封装的一套基于springboot和mybatis的轻量级框架，适用于mysql和postgresql数据库。

我围绕基类（BaseDao）封装通用的基本的增删改查，联表查询（备注：现版本只支持一对一关联、多对多关联后续版本会做扩展），部分空间信息搜索（备注：现版本只有poi搜索接口中出现过的搜索）。

这架构的优势：
	
	1、使用人员可以在不写任何sql语句的情况下操作数据库。
	2、查询效率快（相比Hibernate的HQL语句）。
	3、较好扩展性（只需针对BaseDao添加自己的新接口即可）。
	4、减少冗余性代码，更有利于代码管理。
	
注解介绍：
	1、@TableName：用于表和POJO类之间建立映射关系。
	2、@Column：用于表字段和POJO类字段之间建立映射关系，支持下划线命名法和驼峰法的自动转换。
	  	isGeom：是用于判断当前字段是否是postgis中的geometry空间坐标字段；
	  	coordType：坐标的类型，它是基于isGeom = true时使用，主要有5种形式：
	  		1、lng（经度），2、lat（纬度），3、location（经度，纬度），4、line_edge（线的边界坐标），5、poly_edge（面的边界坐标）。
	3、@JoinColumn：用于级联查询。
		table：关联的子表名（备注：可以不填，默认使用字段名）；
		master：主表的中的关联字段；
		slaver：子表中的关联字段（备注：可以不填，默认使用字段"id"）。
	4、@Index：用于ElasticSearch的索引和POJO类之间建立映射关系。
		indexName：索引名称；
		typeName：类型名称；
		shardsNum：索引分片数量；
		replicasNum：索引备份数量。
	5、@Meta：用于ElasticSearch索引字段和POJO类字段之间建立映射关系。
		name：字段名称；
		type：字段类型；
		isAnalyzer：当前字段是否使用分词；
		analyzer：分词器，它是基于isAnalyzer = true时使用，有ik分词等；
		store：是否存储的是索引的原始内容；
		docValues：坐标类型是否节省空间；
		coordinate：是否属于坐标数组类型；
		merge：是否属于合并坐标。
		
where对象介绍：
	基本查询：	
		1、eq(Symbol condition, String columnName, Object value, Class<?> clazz)：等于
		2、ne(Symbol condition, String columnName, Object value, Class<?> clazz)：不等于
		3、gt(Symbol condition, String columnName, Object value)：大于；
		4、lt(Symbol condition, String columnName, Object value)：小于；
		5、like(Symbol condition, String columnName, Object value)：模糊查询，等于： and name like "%测试%"；
		6、in(Symbol condition, String columnName, String values, Class<?> clazz)：包含；
		7、isNull(Symbol condition, String columnName)：为空；
		8、isNotNull(Symbol condition, String columnName)：不为空；
	空间查询：	
		1、pointLocatedLine(Symbol condition, String location)：点所在的线段；
		2、pointLocatedPolygon(Symbol condition, String location)：点所在的多边形；
		3、rangeContainPolygon(Symbol condition, String range)：范围内包含的多边形；
	分页：
		limit(int num, int size)；
	
备注：具体使用方法请参考TestServiceImpl等例子。
	

使用方法：
	1、首先当中POJO类使用了@Data标注，需要安装lombok插件（备注：简化代码，因为它的提供了get,set,equals,hashCode,toString方法）。
	2、接口继承BaseDao实现类，即可使用当中的方法，方法介绍如下：
		count(where)：查询总数；
		get(where)：查询单个实体；
		list(where)：查询列表；
		getCascadeList(where)：查询级联列表；
		add(entity)：添加单个实体；
		update(entity)：修改单个实体；
		update(columnMap, where)：根据条件批量修改；
		delete(id)：根据id删除实体；
		delete(where)：根据条件批量删除。

备注：具体使用方法请参考TestController等例子。
	
