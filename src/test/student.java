package test;

public class student {
	private int id;
	private String name;
	private double grade;

	public student(int id, String name, double grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getid(){
		return id;
	}
	public void setid(int id){
		this.id = id;
	}
	public double getGrade(){
		return grade;
	}
	public void setGrade(double grade){
		this.grade = grade;
	}
}
