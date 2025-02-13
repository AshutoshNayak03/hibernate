package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "employee") // Ensure table name matches DB
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private int empId;

    @Column(name = "emp_name") // Ensure column name matches DB
    private String empName;

    public Employee() {} // ✅ Default constructor required by Hibernate

    public Employee(String empName) {
        this.empName = empName;
    }

    // Getters and Setters
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }
    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }
}
