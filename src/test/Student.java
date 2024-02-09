package test;

public class Student {
		private int id;
		private String name;
		private double grade;

		public Student(int id, String name, double grade) {
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
		
		//i do not think I did the toString correctly, please help
		public String toString(){
			return "Student{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", grade=" + grade +
	                '}';
		}
	}

