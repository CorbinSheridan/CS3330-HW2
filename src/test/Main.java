package test;

public class Main {

	public static void main(String[] args) {
		  StudentManager studentManager = new StudentManager(10);
	        boolean success = studentManager.readFromFile("studentData.txt");

	        if (success) {
	            System.out.println("Students successfully read from file.");
	            studentManager.displayStudents();
				studentManager.searchStudent(0);
	           
	        } else {
	            System.out.println("Failed to read students from file.");
	        }

	}

}
