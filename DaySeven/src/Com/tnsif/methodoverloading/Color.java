package Com.tnsif.methodoverloading;


//Base
public class Color {
	
	
	//method getcolor returns an object of type color
	protected Color getColor()
	{
		Color s=new Color();
		return s;
		
	}

}


class Red extends Color
{
	//method getcolor returns an object of type Red
		//protected Red getColor()
		{
			Color s=new Color();
			//return  s;
			
		}
			
}

