package com.chainsys.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.chainsys.model.Event;
import com.chainsys.util.ConnectionUtil;

public class EventDAO {
	public ArrayList<Event> displayEvents() throws Exception {
		ArrayList<Event> eventList = new ArrayList<Event>();

		try {
			Connection connection = ConnectionUtil.getConnection();

			String sql = "select name,amount,organize_date from events_information ";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			// System.out.println(resultSet.getRow());
			while (resultSet.next()) {
				Event event = new Event();
				event.setName(resultSet.getString("name"));
				event.setAmount(resultSet.getInt("amount"));
				Date date = resultSet.getDate("organize_date");
				event.setOrganize_date(resultSet.getDate("organize_date")
						.toLocalDate());
				// System.out.println(date);

				eventList.add(event);
			}
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// throw new Exception("Unable to find book");

		}

		return eventList;

	}

}
