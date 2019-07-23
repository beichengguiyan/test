package test;

import model.Student;

public class Demo {
	public static void main(String[] args) {
		Student student = new Student("Tom");
		student.setAge(16);
		student.setSex("boy");
		student.setStudentID("201901");
		System.out.println(student.getAge());
		System.out.println(student.getSex());
		System.out.println(student.getStudentID());
	}
}
