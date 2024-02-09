package test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StudentManager {
    private Student[] students;

    // Constructor
    public StudentManager(int size) {
        students = new Student[size];
    }

    // Method to read student data from a file
    public boolean readFromFile(String fileName) {
    	 FileInputStream fis = null;
    	    try {
    	        fis = new FileInputStream(fileName);
    	        Scanner scanner = new Scanner(fis);

    	        int index = 0;
    	        while (scanner.hasNextLine()) {
    	            String line = scanner.nextLine();
    	            String[] parts = line.split("\\s+"); // Split by any whitespace

    	            if (parts.length == 4) {
    	                int id = Integer.parseInt(parts[0]);
    	                String name = parts[1] + " " + parts[2]; // Combine first and last names
    	                double grade = Double.parseDouble(parts[3]);

    	                students[index] = new Student(id, name, grade);
    	                index++;
    	            } else {
    	                System.out.println("Invalid data format in file: " + line);
    	            }
    	        }

    	        scanner.close();
    	        return true;
    	    } catch (FileNotFoundException e) {
    	        System.out.println("File not found: " + fileName);
    	    } catch (Exception e) {
    	        System.out.println("Error reading file: " + e.getMessage());
    	    } finally {
    	        if (fis != null) {
    	            try {
    	                fis.close();
    	            } catch (IOException e) {
    	                System.out.println("Error closing FileInputStream: " + e.getMessage());
    	            }
    	        }
    	    }

    	    return false;
    	
    }
		public void displayStudents() {
	        if (students.length == 0 || students[0] == null) {
	            System.out.println("No students found.");
	        } else {
	            for (Student student : students) {
	                if (student != null) {
	                    System.out.println(student);
	                }
	            }
	        }
	    }
    
	
		public void searchStudent(int id) {
			try (Scanner sc = new Scanner(System.in)) {
				id = sc.nextInt();
			for (int i = 0; i < students.length; i++) {
				if (students[i].getid() == id) {
					System.out.println(students[i].toString());
				}
			}
		}
	}
}
	
		
		



