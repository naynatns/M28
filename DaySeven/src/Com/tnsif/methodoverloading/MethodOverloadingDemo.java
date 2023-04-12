package Com.tnsif.methodoverloading;

public class MethodOverloadingDemo {

	public static void main(String[] args) {

		
		System.out.println("Method Overloading");
		
		System.out.println(Maths.addition(12,34));
		System.out.println(Maths.addition(12, 87.4f));
		System.out.println(Maths.addition(34, 67, 78));
		
		Point p=new Point();
		System.out.println(p);
		
		Point p1=new Point(1,2);
		System.out.println(p1);

		Point p2=new Point(5);
		System.out.println(p2);

		
	}

}
