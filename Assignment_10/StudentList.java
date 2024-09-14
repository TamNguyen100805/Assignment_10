package Assignment_10;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentList;

    // Constructor
    public StudentList() {
        studentList = new ArrayList<>();
    }

    // Thêm sinh viên vào danh sách
    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    // Xóa sinh viên theo ID
    public void deleteStudentById(String id) {
        Student student = findStudentByID(id);
        if (student != null) {
            studentList.remove(student);
            System.out.println("Student with ID " + id + " deleted.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // Tìm sinh viên theo ID
    public Student findStudentByID(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }

    // Cập nhật thông tin sinh viên theo ID
    public void updateStudentByID(String id) {
        Student student = findStudentByID(id);
        if (student != null) {
            System.out.println("Updating information for student with ID " + id + ":");
            student.enterStudentInfo(); // Sử dụng phương thức nhập thông tin để cập nhật
            System.out.println("Student information updated.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // Hiển thị tất cả sinh viên trong danh sách
    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            for (Student student : studentList) {
                student.displayInfo();
                System.out.println("------------------------");
            }
        }
    }

    // Tìm sinh viên có GPA cao nhất
    public Student findTopStudent() {
        if (studentList.isEmpty()) {
            return null;
        }

        Student topStudent = studentList.get(0); // Giả sử sinh viên đầu tiên có GPA cao nhất
        for (Student student : studentList) {
            if (student.getGPA() > topStudent.getGPA()) {
                topStudent = student;
            }
        }
        return topStudent;
    }
}
