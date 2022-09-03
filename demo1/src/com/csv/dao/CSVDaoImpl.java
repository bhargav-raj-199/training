package com.csv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.csv.bean.Employee;
import com.csv.model.ModelDAO;

public class CSVDaoImpl implements CSVDao{

	public void save(Employee employee) {
		String sql="insert into employee values(?,?,?)";
		Connection connection=null;
		connection=ModelDAO.openConnection();
		PreparedStatement ps=null;
		try {
			ps=connection.prepareStatement(sql);
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getCity());
			ps.setInt(3, employee.getSalary());
			ps.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ModelDAO.closeConnection();
		}
	}

}
