package com.chainsys.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.DAO.ForgotPasswordDAO;
import com.chainsys.DAO.RegisterDAO;
import com.chainsys.model.Registration;
import com.chainsys.validator.LoginValidator;

/**
 * Servlet implementation class ForgotPasswordServlet
 */
@WebServlet("/ForgotPasswordServlet")
public class ForgotPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotPasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
        String password=request.getParameter("password");
       // System.out.println(password);
        Registration registration = new Registration();
        registration.setId(id);
		registration.setPassword(password);
	 ForgotPasswordDAO dao = new ForgotPasswordDAO();
	 LoginValidator loginvalidator=new LoginValidator();
	 
      
	 try {
	       if(loginvalidator.checkId(id)==true)
	       {
		 dao.changePassword(registration);
		 RequestDispatcher rd = request
					.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
	 }
	       else
	       {request.setAttribute("ERROR","Id does not exists in database");
	       RequestDispatcher rd = request
					.getRequestDispatcher("forgotpassword.jsp");
			rd.forward(request, response);
		}
	       }
	      
       catch (Exception e) {
			RequestDispatcher rd = request
					.getRequestDispatcher("forgotpassword.jsp");
			rd.forward(request, response);
		}

       } 
       }
	
	
