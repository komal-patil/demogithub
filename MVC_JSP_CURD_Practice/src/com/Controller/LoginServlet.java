package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ServiceImplimentation.ServiceImpl;
import com.ServiceInterface.ServiceInterface;
import com.model.Student;
@WebServlet("/log")
public class LoginServlet extends HttpServlet {
	
	ServiceInterface si=new ServiceImpl();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname=request.getParameter("un");
		
		String pass=request.getParameter("pw");
		
		Student s=new Student();
		
		if (uname.equals("admin") && pass.equals("admin")) {
			
			System.out.println("show all data");
			List<Student> list=si.showAlldata();
			
			request.setAttribute("ldata", list);
			RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
			
		}
		else
		{
					
			List<Student> list=si.login(uname, pass);
			request.setAttribute("ldata", list);
			RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
			
		}
		
		
		
	
		
		
		
	}

}
