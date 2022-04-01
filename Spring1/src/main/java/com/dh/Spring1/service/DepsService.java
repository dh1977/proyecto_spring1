package com.dh.Spring1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dh.Spring1.model.dao.IDepsDao;
import com.dh.Spring1.model.dto.DepsDto;

@Service
public class DepsService implements IDepsService {
	@Autowired
	private IDepsDao depsDao;
	
	public DepsService() {}
		
	
	@Override
	public int insert(DepsDto depsDto) {
		return depsDao.insert(depsDto);
	}

	@Override
	public int update(DepsDto depsDto) {
		return depsDao.update(depsDto);
	}

	@Override
	public int delete(String dept_no) {
		return depsDao.delete(dept_no);
	}

	@Override
	public DepsDto select(String dept_no) {
		return depsDao.select(dept_no);
	}

	@Override
	public List<DepsDto> selectAll() {
		return depsDao.selectAll();
	}

}
