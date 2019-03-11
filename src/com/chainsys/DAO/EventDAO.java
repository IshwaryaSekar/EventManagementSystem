package com.chainsys.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.model.Event;
import com.chainsys.util.ConnectionUtil;

public class EventDAO {
	public List<Event> displayEvents() throws Exception {
		List<Event> eventList = new ArrayList<Event>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select name,amount,organize_date from events_information ";
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
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

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// throw new Exception("Unable to find book");
		} finally {
			ConnectionUtil.close(connection, preparedStatement, resultSet);
		}
		return eventList;

	}

}
