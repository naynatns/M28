package Com.tnsif.methodoverloading;

public class Point {
	
	private float x;
	private float y;
	
	//default 	
	public Point() {
		this.x =0.0f ;
		this.y =0.0f ;
	}
	
	
	//one parameter
	public Point(float x) {
		this.x = x;
		this.y = x;
	}

//two parameter
	public Point(float x, float y) {
	
		this.x = x;
		this.y = y;
	}


	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	

}
