package serial.agile.com;

import java.io.Serializable;

public class Emp implements Serializable{
	int rollno;
	String name;
	float marks;
	
	@Override
	public String toString() {
		return "Emp [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int rollno, String name, float marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
		

}
