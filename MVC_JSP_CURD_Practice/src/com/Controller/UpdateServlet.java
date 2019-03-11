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
@WebServlet("/up")
public class UpdateServlet extends HttpServlet {

	ServiceInterface si=new ServiceImpl();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student s=new Student();
		s.setName(request.getParameter("nm"));
		s.setAddress(request.getParameter("ad"));
		s.setUsername(request.getParameter("un"));
		s.setPassword(request.getParameter("pw"));
		
		int id=Integer.parseInt(request.getParameter("id"));
		s.setId(id);
		List<Student> list=si.update(s);
	//	List<Student> list=si.showAlldata();
		request.setAttribute("ldata", list);
		RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
				
		
	
	}
}
