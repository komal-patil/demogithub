package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Session session=HibernateUtil.getsessionfactory().openSession();
		int rid=Integer.parseInt((request.getParameter("rl"))); 
		System.out.println("role id:"+rid);
		Role r=session.get(Role.class, rid);
	
		//r.setRid(2);
		//r.setRname("admin");
		//r.setRname("manager");
		//r.setRname("user");

		
		
		r.setRid(rid);
		User u=new User();
		u.setName(request.getParameter("nm"));
		u.setEmail(request.getParameter("em"));
		u.setRole(r);
		
		
		Login l=new Login();
		l.setUsername(request.getParameter("un"));
		l.setPassword(request.getParameter("pw"));
		l.setUser(u);
		
		//session.save(r);
		//session.save(u);
		session.save(l);
		
		session.beginTransaction().commit();
		
	}
	
}
