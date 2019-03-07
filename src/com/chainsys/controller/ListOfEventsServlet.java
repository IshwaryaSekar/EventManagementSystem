package com.chainsys.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.DAO.EventDAO;
import com.chainsys.model.Event;

/**
 * Servlet implementation class ListOfEventsServlet
 */
@WebServlet("/ListOfEventsServlet")
public class ListOfEventsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListOfEventsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EventDAO dao = new EventDAO();
		try {
			//System.out.println("success");

			List<Event> eventList = dao.displayEvents();
			request.setAttribute("EVENTS", eventList);
			RequestDispatcher rd = request
					.getRequestDispatcher("listofevents.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			RequestDispatcher rd = request.getRequestDispatcher("eventdatafailure.html");
			rd.forward(request, response);
		}

	}

}
