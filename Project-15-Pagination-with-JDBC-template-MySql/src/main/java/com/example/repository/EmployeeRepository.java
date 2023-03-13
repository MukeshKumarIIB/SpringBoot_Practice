package com.example.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;
import com.example.service.EmployeeRowMapper;

@Repository
public class EmployeeRepository implements EmployeeRepositoryImplemented {

	@Autowired
	private JdbcTemplate jdbcTemp;

	@Override
	public Employee findById(int id) {

		String sql = "SELECT * FROM Employee WHERE id=?";

		List<Map<String, Object>> employee = jdbcTemp.queryForList(sql, new EmployeeRowMapper(), id);

		return  (Employee) employee;
	}

	@Override
	public List<Employee> findAll() {

		return jdbcTemp.query("select * from EMPLOYEE", new EmployeeRowMapper());

	}

	@Override
	public int updateEmployee(String name, int age) {
		String sql = "UPDATE EMPLOYEE SET NAME=? WHERE AGE=?";

		int noOfRowAffected = jdbcTemp.update(sql, name, age);

		return noOfRowAffected;
	}

	@Override
	public int deleteEmp(String name, int age) {

		String sql = "DELETE FROM EMPLOYEE WHERE NAME=? AND AGE=?";

		int deletedRow = jdbcTemp.update(sql, name, age);
		return deletedRow;
	}

	public List<Employee> getEmployeeByPage(int pageId, int pageSize) {

		String sql = "SELECT * FROM employee LIMIT" + (pageId - 1) + "," + pageSize;

		return jdbcTemp.query(sql, new EmployeeRowMapper() {

			public Employee mapRow(ResultSet rs, int row) throws SQLException {

				Employee e = new Employee();

				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setAge(rs.getInt(3));
				e.setSalary(rs.getInt(4));

				return e;
			}

		});

	}

}
