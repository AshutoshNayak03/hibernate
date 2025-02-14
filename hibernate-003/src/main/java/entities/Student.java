package entities;

/**
 * 
 */
public class Student {
	private int rollNo;
	private String stuName;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Student( String stuName) {
		super();

		this.stuName = stuName;
	}


}