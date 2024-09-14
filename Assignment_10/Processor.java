package Assignment_10;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student by id");
            System.out.println("3. Delete a student by id");
            System.out.println("4. Display all students");
            System.out.println("5. Find the student with the highest GPA");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Thêm sinh viên
                    Student newStudent = new Student(null, null, null, 0, null);
                    newStudent.enterStudentInfo();
                    studentList.addStudent(newStudent);
                    break;
                case 2:
                    // Cập nhật sinh viên theo ID
                    System.out.print("Enter student ID to update: ");
                    String updateId = scanner.nextLine();
                    studentList.updateStudentByID(updateId);
                    break;
                case 3:
                    // Xóa sinh viên theo ID
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    studentList.deleteStudentById(deleteId);
                    break;
                case 4:
                    // Hiển thị tất cả sinh viên
                    studentList.displayAllStudents();
                    break;
                case 5:
                    // Tìm sinh viên có GPA cao nhất
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Student with the highest GPA:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students found.");
                    }
                    break;
                case 6:
                    // Thoát chương trình
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
