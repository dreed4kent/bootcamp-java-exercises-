package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Department> getAllDepartments() {
		List<Department> departments = new ArrayList<Department>();
		String selectAllDepartments = "select * from departments";
		SqlRowSet result = jdbcTemplate.queryForRowSet(selectAllDepartments);
		
		while (result.next()) {
			
		}
			
		return departments;
	}

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		List<Department> deptList = new ArrayList<Department>();
		String sqlByName = "SELECT department_id, name FROM department WHERE name = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlByName, nameSearch);	// only when using SELECT statement
	
		while(result.next()) {
			Department d = mapRowToDepartment(result);
			deptList.add(d);
		}
		return deptList;
	}

	@Override
	public void saveDepartment(Department updatedDepartment) {
		//INSERT INTO department (name) VALUES (?) 
		String sqlCreateDept = "INSERT INTO department (name) VALUES (?)";
		jdbcTemplate.update(sqlCreateDept, updatedDepartment.getName());
		
	}

	@Override
	public Department createDepartment(Department newDepartment) {
		Department department = new Department();
		String sqlCreateDeparment = "INSERT INTO department (department_id, name) VALUES (?,?)";
		jdbcTemplate.update(sqlCreateDeparment, department.getId());
		department.setId(getNextDepartmentId());
	    return department;
	}
	
	private Long getNextDepartmentId() {
		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval ('seq_department_id')");
		if (nextIdResult.next()) {
			return nextIdResult.getLong(1);
		} else {
			throw new RuntimeException("Something went wrong while getting an id for the new department id");
		}
	}

	@Override
	public Department getDepartmentById(Long id) {
		Department department = new Department();
		String sqlGetDepartmentbyID = "SELECT department_id, name FROM department WHERE department_id = ?";
		SqlRowSet departmentName = jdbcTemplate.queryForRowSet(sqlGetDepartmentbyID, id);
		if (departmentName.next()) {
			department = mapRowToDepartment(departmentName);
		}
		return department;
	}
	
	private Department mapRowToDepartment(SqlRowSet result) {
		Department department = new Department();
		department.setId(result.getLong("department_id"));
		department.setName(result.getString("name"));
		return department;
	}

}
