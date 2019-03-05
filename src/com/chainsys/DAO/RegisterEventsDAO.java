package com.chainsys.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.chainsys.model.Event;
import com.chainsys.model.Student;
import com.chainsys.util.ConnectionUtil;

public class RegisterEventsDAO {
	public void addStudent(Student student) throws Exception {
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "insert into student10 (id,email,year,eventname) values (?,?,?,?)";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);

			

			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getEmail());
			preparedStatement.setString(3, student.getYear());
			
            preparedStatement.setString(4, student.getEvent().getName());
            int rows = preparedStatement.executeUpdate();
			System.out.println("Rows inserted: " + rows);
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (Exception e) {
			e.printStackTrace();
			// throw new Exception("Unable to insert book");
		}
	}
	public ArrayList<Student> displayStudentsList() throws Exception {
		ArrayList<Student> studentList = new ArrayList<Student>();

		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql1 = "select id,email,year,eventname from student10 order by id asc";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql1);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println(resultSet.getRow());
			while (resultSet.next()) {
				Student student=new Student();
			    
				
			    student.setId(resultSet.getInt("id"));
				student.setEmail(resultSet.getString("email"));
				student.setYear(resultSet.getString("year"));
				
				Event event = new Event();
				event.setName(resultSet.getString("eventname"));
				student.setEvent(event);
				studentList.add(student);
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// throw new Exception("Unable to find book");

		}

		return studentList;

	}


}
