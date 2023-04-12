package Com.tnsif.methodoverloading;

public class RBI {
	
	public float getROI()
	{
		return 6.7f;
	}
		
	}

class SBI extends RBI
{
	public float getROI()
	{
		return 5.7f;
	}
	
	}

class Axis extends RBI
{
	public float getROI()
	{
		return 8.8f;
	}
	
	}

class ICICI extends RBI
{
	public float getROI()
	{
		return 4.8f;
	}
	
	}