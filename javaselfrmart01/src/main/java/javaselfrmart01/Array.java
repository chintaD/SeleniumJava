package javaselfrmart01;

public class Array 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int MyIntArray [] = {105,200,3,1,5};
		String MyStringArray [] = {"Mango","Orange","Grape"};
				
		for(int element : MyIntArray) 
		{
			System.out.println(element);
		}
		
		for (int i=0; i < MyStringArray.length; i++) {
			
			System.out.println(MyStringArray[i]);
		}
		

	}

}
