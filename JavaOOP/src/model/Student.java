package model;

public class Student {
	String name;
	int age;
	String sex;
	String studentID;

	public Student(String name) {
		this.name = name;
	}

	// 设置年龄
	public void setAge(int age) {
		this.age = age;
	}

	// 获取年龄
	public int getAge() {
		return age;
	}

	// 设置性别
	public void setSex(String sex) {
		this.sex = sex;
	}

	// 获取性别
	public String getSex() {
		return sex;
	}

	// 设置学号
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	// 获取学号
	public String getStudentID() {
		return studentID;
	}
}
