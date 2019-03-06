package com.chainsys.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.chainsys.model.Registration;
import com.chainsys.util.ConnectionUtil;

public class RegisterDAO {
	public void addStudentDetails(Registration registration) throws Exception {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into register (name,id,password,mobilenumber) values (?,?,?,?)";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, registration.getName());
			// System.out.println(registration.getName());
			preparedStatement.setInt(2, registration.getId());
			preparedStatement.setString(3, registration.getPassword());
			preparedStatement.setString(4, registration.getMobilenumber());
			int rows = preparedStatement.executeUpdate();
			System.out.println("Rows inserted: " + rows);
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (Exception e) {
			e.printStackTrace();
			// throw new Exception("Unable to insert book");
		}
	}

}
