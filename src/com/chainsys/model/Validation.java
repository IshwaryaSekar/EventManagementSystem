package com.chainsys.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.chainsys.util.ConnectionUtil;

public class Validation {
	public static boolean checkUser(String name, String password) {
		boolean statement = false;
		try {
			Connection connection = ConnectionUtil.getConnection();
			// System.out.println(connection);
			String sql = "select * from register where name=? and password=?";
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

	public static boolean checkId(int id) {
		boolean statement = false;
		try {
			Connection connection = ConnectionUtil.getConnection();
			// System.out.println(connection);
			String sql1 = "select * from register where id=? ";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql1);
			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();
			statement = resultSet.next();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return statement;
	}

	public static boolean checkExists(int id) {
		boolean statement1 = true;
		try {
			Connection connection = ConnectionUtil.getConnection();
			// System.out.println(connection);

			String sql2 = "select id from student10 where id=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql2);
			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();
			statement1 = resultSet.next();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(statement1);
		return statement1;
	}

}
