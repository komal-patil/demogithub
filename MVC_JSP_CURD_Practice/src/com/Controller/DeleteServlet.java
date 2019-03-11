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

@WebServlet("/dl")
public class DeleteServlet extends HttpServlet {
	
	ServiceInterface si=new ServiceImpl();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id=Integer.parseInt(request.getParameter("select"));
		List<Student> list=si.delete(id);
		//=si.showAlldata();
				
		
		
		request.setAttribute("ldata", list);
		RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
	}

}
