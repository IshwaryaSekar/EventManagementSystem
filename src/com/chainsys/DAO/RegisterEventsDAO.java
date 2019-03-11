package com.chainsys.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.model.Event;
import com.chainsys.model.Student;
import com.chainsys.util.ConnectionUtil;

public class RegisterEventsDAO {
	public void addStudent(Student student) throws Exception {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into register_event (id,email,year,eventname) values (?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getEmail());
			preparedStatement.setString(3, student.getYear());

			preparedStatement.setString(4, student.getEvent().getName());
			int rows = preparedStatement.executeUpdate();
			System.out.println("Rows inserted: " + rows);
		
		} catch (Exception e) {
			e.printStackTrace();
			// throw new Exception("Unable to insert book");
		}
		finally
		{			ConnectionUtil.close(connection, preparedStatement, null);

		}
		}
	

	public List<Student> displayStudentsList() throws Exception {
		List<Student> studentList = new ArrayList<Student>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql1 = "select id,email,year,eventname from register_event order by id asc";
			preparedStatement = connection.prepareStatement(sql1);
			resultSet = preparedStatement.executeQuery();
			System.out.println(resultSet.getRow());
			while (resultSet.next()) {
				Student student = new Student();

				student.setId(resultSet.getInt("id"));
				student.setEmail(resultSet.getString("email"));
				student.setYear(resultSet.getString("year"));

				Event event = new Event();
				event.setName(resultSet.getString("eventname"));
				student.setEvent(event);
				studentList.add(student);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// throw new Exception("Unable to find book");

		} finally {
			ConnectionUtil.close(connection, preparedStatement, resultSet);

		}
		return studentList;

	}

}
