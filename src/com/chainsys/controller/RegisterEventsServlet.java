package com.chainsys.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.DAO.RegisterEventsDAO;
import com.chainsys.model.Event;
import com.chainsys.model.Registration;
import com.chainsys.model.Student;
import com.chainsys.model.Validation;
import com.chainsys.validator.RegisterEventsValidator;
import com.chainsys.validator.RegisterValidator;

/**
 * Servlet implementation class RegisterEventsServlet
 */
@WebServlet("/RegisterEventsServlet")
public class RegisterEventsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterEventsServlet() {
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
	
		// System.out.println(name);
		int id = Integer.parseInt(request.getParameter("id"));
		// System.out.println(id);

		String email = request.getParameter("email");
		String year = request.getParameter("year");
	
		String eventname = request.getParameter("eventname");
		if(Validation.checkId(id)) 
	    {  
			if(Validation.checkExists(id)==false) 
	    {
		Student student = new Student();
       
		student.setId(id);
		student.setEmail(email);
		student.setYear(year);
	
		Event event = new Event();
		event.setName(eventname);
		student.setEvent(event);
       RegisterEventsDAO dao=new  RegisterEventsDAO();
		RegisterEventsValidator registerEventsValidator = new RegisterEventsValidator();

		try {
			registerEventsValidator.validateId(student);

			System.out.println("success");
			dao.addStudent(student);
			List<Student> studentList = dao.displayStudentsList();
			request.setAttribute("STUDENTS", studentList);
			RequestDispatcher rd = request
					.getRequestDispatcher("liststudents.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("failure.html");
			rd.forward(request, response);
		}
	}
    else
    {RequestDispatcher rs = request.getRequestDispatcher("registerexists.html");
        rs.forward(request, response);
	    }
	    }
		else
		{
			
	        
	        RequestDispatcher rs = request.getRequestDispatcher("validateuser.html");
	         rs.forward(request, response);
}
}
}