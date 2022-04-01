package com.dh.Spring1.model.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.dh.Spring1.model.dto.DepsDto;

@Repository
@Transactional
public class DepsDao implements IDepsDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public DepsDao() {}
	

	@Override
	public int insert(DepsDto depsDto) {
//		String sql = "INSERT INTO departments VALUES(?,?)";
		return 0;
	}

	@Override
	public int update(DepsDto depsDto) {
//		String sql = "UPDATE departments SET dept_name = ? WHERE dept_no=?)";
		return 0;
	}

	@Override
	public int delete(String dept_no) {
//		String sql = "DELETE FROM departments WHERE dept_no=?";
		return 0;
	}

	@Override
	public DepsDto select(String dept_no) {
//		String qry = "SELECT dept_name FROM departments WHERE dept_no=?";

		return null;
	}

	@Override
	public List<DepsDto> selectAll() {
		//String qry = "SELECT dept_no, dept_name FROM departments";
		String qry =  "select 'uno' emp_no, 'dos' emp_name from dual";
		
		List<DepsDto> listaDeps = 
			jdbcTemplate.query( qry, BeanPropertyRowMapper.newInstance(DepsDto.class));

//		List<DepsDto> listaDeps = new ArrayList<DepsDto>();
//		listaDeps.add( new DepsDto("1","uno"));
		
		return listaDeps;
	}

}
