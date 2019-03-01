package com.ritu.cms.base.vo;

import lombok.Data;

@Data
public class PageInfo<T> {
	
	public PageInfo(){}
	
	public PageInfo(Integer pageNum,Integer pageSize){
		this.pageSize = (null != pageSize && 0 != pageSize) ? pageSize : 10;
		this.pageNum = null != pageNum ? (pageNum * pageSize) : 0;
	}
	
	/**
	 *  当前页码
	 */
	private Integer pageNum;
	/**
	 *  每页可显示项数
	 */
	private Integer pageSize;
	/**
	 *  总数据项数
	 */
	private Long totalSize;
	/**
	 *  总页数
	 */
	private Integer totalPage;
	/**
	 *  显示结果集合
	 */
	private Object result;
	/**
	 *  当前页数据量
	 */
	private Integer currentSize;
}
