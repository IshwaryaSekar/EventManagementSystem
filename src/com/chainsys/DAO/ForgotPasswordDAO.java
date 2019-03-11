package com.chainsys.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.chainsys.model.Registration;
import com.chainsys.util.ConnectionUtil;

public class ForgotPasswordDAO {
	public void changePassword(Registration registration) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "update   register_account set password=? where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, registration.getPassword());
			// System.out.println(registration.getName());
			preparedStatement.setInt(2, registration.getId());

			int rows = preparedStatement.executeUpdate();
			System.out.println("Rows updated: " + rows);

		} catch (Exception e) {
			e.printStackTrace();
			// throw new Exception("Unable to insert book");
		} finally {
			ConnectionUtil.close(connection, preparedStatement, null);

		}

	}
}
