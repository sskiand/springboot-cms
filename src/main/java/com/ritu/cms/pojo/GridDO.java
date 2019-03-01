package com.ritu.cms.pojo;

import java.io.Serializable;

import com.ritu.cms.index.annotation.Column;
import com.ritu.cms.index.annotation.TableName;

import lombok.Data;

@Data
@TableName(value = "grid")	
public class GridDO implements Serializable {

	/**
	 * 描述：
	 */
	private static final long serialVersionUID = -8158118353806974858L;
	
	@Column
	private Integer id;
	
	@Column(name = "gid")
	private String objectId;
	
	@Column(name = "grid_code")
	private String gridMain;
	
	private String color;
	
	@Column
	private String gridCode;
	
	@Column
	private String gridName;
	
	@Column(isGeom = true, coordType = "location")
	private String location;
	
	@Column(isGeom = true, coordType = "lat")
	private Double lat;
	
	@Column(isGeom = true, coordType = "lng")
	private Double lng;
	
	@Column(isGeom = true, coordType = "poly_edge")
	private String edgeLocation;
	
	@Column
	private String street;
}
