package Assignment_10;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person implements IPerson {
    protected String id;
    protected String fullName;
    protected Date dateOfBirth;

    // Constructor
    public Person(String id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters và Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Triển khai phương thức displayInfo của IPerson (phải được triển khai bởi các lớp con)
    @Override
    public abstract void displayInfo();

    // Phương thức toString để hiển thị thông tin chung
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateOfBirthStr = sdf.format(dateOfBirth);
        return "ID: " + id + "\n"
                + "Full Name: " + fullName + "\n"
                + "Date of Birth: " + dateOfBirthStr;
    }
}
