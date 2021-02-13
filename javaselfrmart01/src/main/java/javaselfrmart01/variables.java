package javaselfrmart01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class variables 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		//calculateresult();
		//splitusingscanner();
		//exercise();
		//booleaninvert();
		//conditionalvalue();
		ArithmeticDemo();
		

	}

	public static void calculateresult()
	
	{
		
		
		System.out.println("Enter the first number");
		int x = scan.nextInt();
		
		System.out.println("Enter the second number");
		int y = scan.nextInt();
		
		// TODO Auto-generated method 
				
				short z = 1000;
				long q = 1000000000;
				boolean ans = true;
				double division;
				division = (double)(y/x);
				System.out.printf("%.2f",division);
					
	}
	
	public static  void splitusingscanner() 
	{
		
		 System.out.println("Enter the string -");
		 //String input = "1 fish 2 fish red fish blue fish";
	     int compareresult = scan.nextLine().compareTo("Hello World");
	     //System.out.println(scan.nextLine().compareTo("Hello World"));
	     System.out.println(compareresult);
	     if (compareresult == 0)
	     {
	    	
	    	 System.out.print("Strings match");
	     }
	     
	     else 
	     {
	    	 System.out.print("Strings does not match");
		     	    	 
	     }
	     
	}
	
	public static void exercise()
	{
		int i = 10;
		int n = ++i%5;
		System.out.println("i is -"+i+" and n is-"+n);
	}
	
	public static void booleaninvert()
	{
	boolean booleanvalue = false;
	System.out.println(!booleanvalue);
		
	}
	
	public static void conditionalvalue() 
	{
		int x= 9;
		String y = (2*x == 20) ? "multiplication is correct ": "multiplication is wrong";
		System.out.print(y);
		
	}
	
	public static void ArithmeticDemo() 
	{

	               
	          int result = 1 + 2; // result is now 3
	          System.out.println(result);

	          result -= 1; // result is now 2
	          System.out.println("Expected is 2 and actual is :" +result);

	          result *= 2; // result is now 4
	          System.out.println("Expected is 4 and actual is :"+result);

	          result /=  2; // result is now 2
	          System.out.println("Expected is 2 and actual is :" +result);

	          result += 8; // result is now 10
	          result %= 7; // result is now 3
	          System.out.println("Expected is 3 and actual is :" +result);
	     
	}
}
