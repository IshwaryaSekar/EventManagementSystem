package com.chainsys.validatorfunctions;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.chainsys.util.ConnectionUtil;


public class FunctionalityValidator {
	//check if the student id matches with the register event id
	  public static boolean checkId(int id) {
			boolean statement = false;
			try {
				Connection connection = ConnectionUtil.getConnection();
				// System.out.println(connection);
				String sql1 = "select * from register_account where id=? ";
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
	//check if the student registers more than one event
		public static boolean checkExists(int id) {
			boolean statement1 = true;
			try {
				Connection connection = ConnectionUtil.getConnection();
				// System.out.println(connection);

				String sql2 = "select id from register_event where id=?";
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


