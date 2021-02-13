package javaselfrmart01;

public class Enum 
{
	
	enum Mobile
	{
		Apple, Samsung, HTC, Micromax;
		
		static void getprice(int price)
		{
			
			price = price;
			System.out.println(price);
			
		}
	}
	
	enum Enums
	{
	    A, B(10), C("ccc", 20);
	 
	    //No-arg private constructor
	 
	    private Enums()
	    {
	        System.out.println(1);
	    }
	 
	    //Private constructor taking one argument
	 
	    private Enums(int i)
	    {
	        System.out.println(2);
	    }
	 
	    //Private constructor taking two arguments
	 
	    private Enums(String s, int j)
	    {
	        System.out.println(3);
	    }
	}

	
	  public static void main(String[] args)
	  { // TODO Auto-generated method stub
	  
	  
		  Enums en = Enums.B;   //All enum constants are created while executing this statement. 
		  
	        //While creating each enum constant, corresponding constructor is called
	 
	        Enums en2 = Enums.C;   //No enum constant is created here.
	 
	        Enums en3 = Enums.A;   //No enum constant is created here.
	  
	  
}
	 
}
