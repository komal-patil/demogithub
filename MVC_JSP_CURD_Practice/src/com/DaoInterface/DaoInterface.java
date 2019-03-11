package com.DaoInterface;

import java.util.List;

import com.model.Student;

public interface DaoInterface {
	
	void registerStudent(Student s);
	
	List<Student> login(String uname, String pass);

	List<Student> delete(int id);
	
	
	//List<Student> addStudent();
	
	
	List<Student> edit(int id);
	
	List<Student> update(Student s);
	
	
	List<Student> showAlldata();
}
