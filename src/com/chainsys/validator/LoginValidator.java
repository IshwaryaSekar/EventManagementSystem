package com.chainsys.validator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.chainsys.util.ConnectionUtil;

public class LoginValidator {
	public static boolean checkUser(String name, String password) {
		boolean statement = false;
		try {
			Connection connection = ConnectionUtil.getConnection();
			// System.out.println(connection);
			String sql = "select * from register_account where name=? and password=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			statement = resultSet.next();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return statement;
	}



}
