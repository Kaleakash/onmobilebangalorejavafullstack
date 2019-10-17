package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Autowired
	JdbcTemplate jt;
	
	public int storeEmployeeInfo(int id, 
			String name, 
			float salary) {
		try {
	
return jt.update("insert into employee values(?,?,?)", id,name,salary);
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	public List<Employee> getEmployeeDetails() {
return jt.query("select * from employee", new MyRowExctractor());
	/*return jt.query("select * from employee",
			new ResultSetExtractor<List<Employee>>() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		@Override
		public List<Employee> extractData(ResultSet arg0) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			
			while(arg0.next()) {
				Employee emp = new Employee();
				emp.setId(arg0.getInt(1));
				emp.setName(arg0.getString(2));
				emp.setSalary(arg0.getFloat(3));
				listOfEmp.add(emp);
			}
			
			return listOfEmp;
		}
	} );		
	*/
	}
	
}

class MyRowExctractor implements ResultSetExtractor<List<Employee>>{
	List<Employee> listOfEmp = new ArrayList<Employee>();
	@Override
	public List<Employee> extractData(ResultSet arg0) throws SQLException, DataAccessException {
		while(arg0.next()) {
			Employee emp = new Employee();
			emp.setId(arg0.getInt(1));
			emp.setName(arg0.getString(2));
			emp.setSalary(arg0.getFloat(3));
			listOfEmp.add(emp);
		}
		return listOfEmp;
	}
}
