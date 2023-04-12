package Com.tnsif.methodoverloading;

public class Student implements Cloneable{
	
	int rollNo;
	String className;
	String name;

	// Getters and setters
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Class constructor
	public Student(int rollNo, String className, String name) {
		this.rollNo = rollNo;
		this.className = className;
		this.name = name;
	}

	// Print method
	public void printData() {
		System.out.println("Name : " + name + ", RollNo: " + rollNo + ", Class Name : " + className);
	}

	//override the clone method
	
	public Student clone() throws CloneNotSupportedException
	{
		return (Student)super.clone();
		
	}
}
