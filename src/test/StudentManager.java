package test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentManager {
    private Student[] students;

    // Constructor
    public StudentManager(int size) {
        students = new Student[size];
    }

    // Method to read student data from a file
    public boolean readFromFile(String fileName) {
        try {
            File file = new File("studentData.txt");
            FileInputStream fis = new FileInputStream(file);
            Scanner scanner = new Scanner(fis);

            int index = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double grade = Double.parseDouble(parts[2]);

                    students[index] = new Student(id, name, grade);
                    index++;
                }
            }

            fis.close();
            scanner.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + "studentData.txt");
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
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
    
    }

