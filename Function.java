
public class Function {
	public double add(double a, double b)
	{
		return (a+b);
	}
	public double subtract(double a, double b)
	{
		return a-b;
	}
	public double multiply(double a, double b)
	{
		return a*b;
	}
	public double divide (double a, double b)
	{
		return a/b;
	}
	public double power (double a, double b)
	{
		return Math.pow(a, b);
	}
	public double sin (double a)
	{
		return Math.sin(a);
	}
	public double cos (double a)
	{
		return Math.cos(a);
	}
	public double tan (double a)
	{
		return Math.tan(a);
	}
	public double arcsin(double a)
	{	
		if (a < 1.571 && a > -1.571)
			return Math.asin(a);
		else
			return 999;
	}
	public double arccos(double a)
	{
		if(a < 3.152 && a > 0)
			return Math.acos(a);
		else
			return 999;
	}
	public double arctan(double a)
	{
		return Math.atan(a);
	}
	public double ln (double a)
	{
		if (a>0)
			return Math.log(a);
		else
			return 999;
	}
}
