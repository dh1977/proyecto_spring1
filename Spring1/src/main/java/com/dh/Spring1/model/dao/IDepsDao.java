package com.dh.Spring1.model.dao;

import java.util.List;

import com.dh.Spring1.model.dto.DepsDto;

public interface IDepsDao {
	public int insert(DepsDto depsDto);
	public int update(DepsDto depsDto);
	public int delete(String dept_no);
	public DepsDto select(String dept_no);
	public List<DepsDto> selectAll();
}
