package com.qimooc.common.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PageList implements Serializable {

	private static final long serialVersionUID = 5472321653620726832L;

	// 是否需要总条数，true为分页模式，false为瀑布流模式
	private boolean requireTotalCount = false;
	// 每页显示数量
	private int pageSize = 10;
	// 当前页
	private int currentPage = 1;
	// 是否还有更多记录，瀑布流方式需返回
	private boolean hasMore = true;
	// 总记录数，requireTotalCount为true（即为分页模式，也即非瀑布流模式）时需返回
	private int totalCount;
	// 存放查询结果用的list
	private List<?> list;
	// 起始偏移量
	@SuppressWarnings("unused")
	private int offset;
	// 结束偏移量，分页模式时数值与pageSize相同，瀑布流模式时为pageSize＋1
	@SuppressWarnings("unused")
	private int rowNumLimit;

	@JsonIgnore
	public int getOffset() {
		return (currentPage - 1) * this.pageSize;
	}

	@JsonIgnore
	public int getRowNumLimit() {
		if (this.isRequireTotalCount()) {
			return this.pageSize;
		}
		return this.pageSize + 1;
	}

	public boolean isRequireTotalCount() {
		return requireTotalCount;
	}

	public void setRequireTotalCount(boolean requireTotalCount) {
		this.requireTotalCount = requireTotalCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public boolean isHasMore() {
		return hasMore;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<?> getList() {
		// list.remove(list.size()-1);
		// return (List<?>) list.remove(list.size()-1);
		return list;
	}

	public void setList(List<?> list) {

		if (isRequireTotalCount()) {
			// 分页
			if (this.getOffset() + list.size() < totalCount) {
				hasMore = true;
			} else {
				hasMore = false;
			}
		} else {
			// 瀑布流
			if (list.size() > pageSize) {
				hasMore = true;
				list.remove(list.size() - 1);
				/*
				 * int i = 0; Iterator<?> it = list.iterator(); while
				 * (it.hasNext()) { it.next(); if (i == (list.size() - 1)) {
				 * it.remove(); } i++; }
				 */
			} else {
				hasMore = false;
			}
		}

		this.list = list;

	}
}
