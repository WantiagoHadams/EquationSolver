import java.util.Scanner;
public class EquationSolver 
{
	//public static double function (String func, double val)
	public static String isolate(String func)
	{
		int a = 0;
		int b = 0;
		String par = "(";
		String endpar = ")";
		for (int i = 0; i < func.length(); i++)
		{
			String s = func.substring(i, i+1);
			if (s.equals(par)) 
			{
				a = i;
			}
			if (s.equals(endpar))
			{
				b = i;
				i = func.length();
			}
			if (i == func.length())
			{
				String mini = func.substring(a+1,b);
				return mini;
			}
		}
		return "";
	}
		//get it in the form f(x) = g(x)
		//h(x) = f(x)-g(x)
		//n = 0
		//use a "fake" derivative to determine direction that goes up or down, increment if h' = 0 or is invalid
		//find out which way to go
		//increment x in that direction with tiny increments (i <= 0.001)
		//Once f(n) crosses g(n), average your two closest increments
		//You're golden
		//If it takes too long, just say no answer
		//trycatch Arithmetic exception
		//scan.close();
	
		public static void main(String[] args) {
		EquationReader ER = new EquationReader("X+7=3");
		char[] equationArray = ER.equationConverter();
	}
}
