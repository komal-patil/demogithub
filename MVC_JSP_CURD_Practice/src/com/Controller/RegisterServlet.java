package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ServiceImplimentation.ServiceImpl;
import com.ServiceInterface.ServiceInterface;
import com.model.Student;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{
	
		ServiceInterface si=new ServiceImpl();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("New Student Register Page");
		
		
		
		Student s=new Student();
		s.setName(request.getParameter("nm"));
		s.setAddress(request.getParameter("ad"));
		s.setUsername(request.getParameter("un"));
		s.setPassword(request.getParameter("pw"));
		
		si.registerStudent(s);
		
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("LoginForm.jsp");
		rd.forward(request, response);
		
		
	}
	
	

}
