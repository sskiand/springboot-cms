package com.ritu.cms.pojo;

import java.io.Serializable;

import com.ritu.cms.index.annotation.Column;
import com.ritu.cms.index.annotation.TableName;

import lombok.Data;

@Data
@TableName(value = "navi_arc", schema = "line")
public class RouteDO implements Serializable{
	
	/**
	 * 描述：
	 */
	private static final long serialVersionUID = -3277062639751803092L;

	@Column
	private Long id;
	
	@Column
	private String name;
	
	@Column(isGeom = true, coordType = "line_edge")
	private String edgelocation;
}
