package model;

public class Student {
	String name;
	int age;
	String sex;
	String studentID;

	public Student(String name) {
		this.name = name;
	}

	// ��������
	public void setAge(int age) {
		this.age = age;
	}

	// ��ȡ����
	public int getAge() {
		return age;
	}

	// �����Ա�
	public void setSex(String sex) {
		this.sex = sex;
	}

	// ��ȡ�Ա�
	public String getSex() {
		return sex;
	}

	// ����ѧ��
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	// ��ȡѧ��
	public String getStudentID() {
		return studentID;
	}
}
