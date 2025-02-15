package entities;

/**
 * 
 */
import jakarta.persistence.*;

@Entity
@Table(name = "student_new")
public class Student {
    @Id
    private int rollNo;  // Manually assigned, no @GeneratedValue

    private String stuName;

    public Student() {} // Default constructor

    public Student(int rollNo, String stuName) {  // Constructor with manual ID assignment
        this.rollNo = rollNo;
        this.stuName = stuName;
    }

    public int getRollNo() { return rollNo; }
    public void setRollNo(int rollNo) { this.rollNo = rollNo; }

    public String getStuName() { return stuName; }
    public void setStuName(String stuName) { this.stuName = stuName; }
}
