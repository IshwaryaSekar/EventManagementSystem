package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.DAO.RegisterDAO;
import com.chainsys.model.Registration;
import com.chainsys.validator.RegisterValidator;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
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
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		String password = request.getParameter("password");
		String mobilenumber = request.getParameter("mobilenumber");
		Registration registration = new Registration();

		registration.setName(name);
		registration.setId(id);
		registration.setPassword(password);
		registration.setMobilenumber(mobilenumber);

		System.out.println(registration.toString());
		RegisterDAO dao = new RegisterDAO();
		RegisterValidator registerValidator = new RegisterValidator();

		try {

			registerValidator.validateRegistration(registration);

			dao.addStudentDetails(registration);
			RequestDispatcher rd = request
					.getRequestDispatcher("registeraccountsuccess.html");
			rd.forward(request, response);

		} catch (Exception e) {
			
			request.setAttribute("ERROR_MSG", e.getMessage());
			e.printStackTrace();
			RequestDispatcher rd = request
					.getRequestDispatcher("register.jsp");
			rd.forward(request, response);
		}

	}

}
