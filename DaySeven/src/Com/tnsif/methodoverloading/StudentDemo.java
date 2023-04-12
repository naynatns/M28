package Com.tnsif.methodoverloading;

public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		
		Student s1=new Student(100,"FE","Saket");
		s1.printData();
		
		Student s2=s1.clone();
		s2.setName("Ankit");
		s2.setRollNo(101);
		s2.setClassName("SE");
		s2.printData();
		
		Student s3=s1.clone();
				
		
	
	}

}
