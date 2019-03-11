package com.DaoImplimentation;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.query.Query;

import com.DaoInterface.DaoInterface;
import com.Utility.HibernateUtil;
import com.model.Student;

public class DaoImpl implements DaoInterface{

	Session session=HibernateUtil.getsessionfactory().openSession();
	
	@Override
	public void registerStudent(Student s) {
		
		session.save(s);
		session.beginTransaction().commit();
		
	}

	@Override
	public List<Student> login(String uname, String pass) {
	
		
		String hql="from Student s where s.username=:username and s.password=:password";
		Query<Student> q=session.createQuery(hql, Student.class);
		q.setParameter("username", uname);
		q.setParameter("password", pass);

		System.out.println(hql);
		List<Student> list= q.list();
		
		return list;
	}

	@Override
	public 	List<Student> delete(int id) {

		session.getTransaction().begin();
		String hql="delete from Student where id=:id";
		Query<Student> query=session.createQuery(hql);
		query.setParameter("id",id);
		query.executeUpdate();
		List<Student>list=query.list();
		session.getTransaction().commit();
		return list;
	}

/*	@Override
	public List<Student> addStudent() {
		return registerStudent();
		
	}*/

	@Override
	public List<Student> edit(int id) {
		
		String hql="from Student where id=:id";
		Query<Student> q=session.createQuery(hql, Student.class);
		q.setParameter("id", id);
		List<Student> list= q.list();
		
		return list;
	}

	@Override
	public List<Student> update(Student s) {
		
		session.getTransaction().begin();
		String hql="Update Student set name=:name,address=:address,username=:username,password=:password where id=:id";
		Query<Student> q=session.createQuery(hql);
		System.out.println( "id  "+s.getId());
		q.setParameter("name", s.getName());
		q.setParameter("address", s.getAddress());
		q.setParameter("username",s.getUsername());
		q.setParameter("password", s.getPassword());
	//	System.out.println(hql);
		q.setParameter("id", s.getId());
		q.executeUpdate();
		List<Student> list=q.list();           
		//list.add(s);
		
		session.getTransaction().commit();
		return list;
		
		
		
	}

	@Override
	public List<Student> showAlldata() {
		String hql="from Student";
		Query<Student> q=session.createQuery(hql, Student.class);


		List<Student> list= q.list();
		
		return list;
		
	}



	
	
}
