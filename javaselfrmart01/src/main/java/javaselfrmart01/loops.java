package javaselfrmart01;

public class loops {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a =0;
		//checkwhileloop(a);
		checkdowhileloop(a);
		

	}
	
	static void checkwhileloop(int a)
	{

		while (a <= 10) 
		{
			System.out.println("Executing"+a+"time");
			a++;
		}
		
		
	}
	
	static void checkdowhileloop(int a)
	{

		do
		{
			System.out.println("Executing "+a+" time");
			a++;
		}
		while (a < 10);
		
	}

}
