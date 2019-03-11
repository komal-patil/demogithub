package com.ServiceImplimentation;

import java.util.List;

import com.DaoImplimentation.DaoImpl;
import com.DaoInterface.DaoInterface;
import com.ServiceInterface.ServiceInterface;
import com.model.Student;

public class ServiceImpl implements ServiceInterface {

	DaoInterface di=new DaoImpl();




	@Override
	public void registerStudent(Student s) {

		
		di.registerStudent(s);
	}




	@Override
	public List<Student> login(String uname, String pass) {


		return di.login(uname, pass);
	}




	@Override
	public 	List<Student> delete(int id) {
		return di.delete(id);
		
	}



/*	@Override
	public 	List<Student> addStudent() {

		return di.addStudent();
		
	}
*/



	@Override
	public List<Student> edit(int id) {

		
		return di.edit(id);
	}




	@Override
	public	List<Student> update(Student s) {
		
		
		
		 return di.update(s);

		
		
		
	}




	@Override
	public List<Student> showAlldata() {
	
		
		return di.showAlldata();
	}






}
