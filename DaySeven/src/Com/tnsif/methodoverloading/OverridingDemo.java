package Com.tnsif.methodoverloading;

public class OverridingDemo {

	public static void main(String[] args) {
		
		RBI rbi;  ///object Reference
		
		/*
		 * RBI rbi=new RBI(); System.out.println(rbi.getROI());
		 */
		
		
		//Dynamic Binding //loose coupling//run time poly
		rbi=new SBI();
		System.out.println(rbi.getROI());
		
		rbi=new Axis();
		System.out.println(rbi.getROI());
		
		rbi=new ICICI();
		System.out.println(rbi.getROI());
		
	}

}
