package com.afkghouri.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("student")
public class StudentResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudent(){
		Student student = new Student();
		student.setName("farhan");
		student.setAge(23);
		return student;
	
	}
	@POST
	@Path("create")
	public Student createStudent(Student s){
		System.out.println(s);
		s.setName("farhan");
		return s;
	}
}
