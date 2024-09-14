package Assignment_10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {
    private float GPA;
    private String major;

    // Constructor
    public Student(String id, String fullName, Date dateOfBirth, float GPA, String major) {
        super(id, fullName, dateOfBirth);
        this.GPA = GPA;
        this.major = major;
    }

    // Getters và Setters
    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Phương thức để nhập thông tin sinh viên
    public void enterStudentInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ID: ");
        setId(scanner.nextLine());

        System.out.println("Enter Full Name: ");
        setFullName(scanner.nextLine());

        System.out.println("Enter GPA: ");
        setGPA(Float.parseFloat(scanner.nextLine()));

        System.out.println("Enter Date of Birth (dd/MM/yyyy): ");
        String dobString = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dob = sdf.parse(dobString);
            setDateOfBirth(dob);
        } catch (Exception e) {
            System.out.println("Invalid date format.");
        }

        System.out.println("Enter Major: ");
        setMajor(scanner.nextLine());
    }

    // Triển khai phương thức displayInfo từ interface IPerson
    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }

    // Ghi đè phương thức toString để hiển thị thông tin chi tiết của sinh viên
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dobStr = sdf.format(dateOfBirth);
        return super.toString() + "\n"
                + "GPA: " + GPA + "\n"
                + "Major: " + major;
    }
}
