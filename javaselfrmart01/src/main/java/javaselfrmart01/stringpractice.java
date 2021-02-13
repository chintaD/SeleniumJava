package javaselfrmart01;

import java.util.HashMap;
import java.util.Set;

class A
{
	int i;

	public A(int i)
	{
		this.i = i;
	}

	//toString() method is not overrided.
	//So, it will return physical address of the object
}

class B
{
	int i;

	public B(int i)
	{
		this.i = i;
	}

	//Overriding toString() method

	@Override
	public String toString()
	{
		return "value you passed is: i = "+i;
	}
}

public class stringpractice
{
	public static void main(String[] args)
	{
		/*
		 * A a = new A(50);
		 * 
		 * String s = "Java";
		 * 
		 * //Concatenating a string object with A-type
		 * 
		 * System.out.println(s+a); //Output : Javastrings.A@42719c
		 * 
		 * B b = new B(100);
		 * 
		 * //Concatenating string object with B-type
		 * 
		 * System.out.println(s+b); //Output : Javai = 100
		 */    

	String mystring = "Today is a beautiful day";
	String caps = "TODAY IS A BEAUTIFUL DAY";
	//System.out.println("HI");
	char[]dst= mystring.toCharArray();
	
	//System.out.println(mystring.substring(5, 11));
	int Result = mystring.compareTo(caps);
	//System.out.println(Result);
	for (char ch :dst )
	{
		//System.out.print(ch);
	}
	
	String s = new String("I am a man ");
	String y = "mam In an";
	
	//countrepetitions(s);
	//removewhitespace(s);
	//findduplicates(s);
	//reverse(s);
	}
	
	 static void countrepetitions(String s)
	 {
	 	
	 	s = s;
	 	HashMap<Character, Integer> charcountmap = new HashMap<Character, Integer>();
	 	char[] strArray = s.toCharArray();
	 	
	 	for (char c: strArray)
	 	{
	 		if (charcountmap.containsKey(c)) {
	 			charcountmap.put(c, charcountmap.get(c)+1);
	 		}
	 		else {
	 			charcountmap.put(c, 1);
	 		}
	 	}
	 	//System.out.println(charcountmap);
	 	
	 }
	 
	 static void removewhitespace(String s) {
		 s =s;
		 
		 	char[] strArray = s.toCharArray();
		 	String swithoutspaces="";
		 	for (int i = 0; i< strArray.length; i++)
		 	{
		 		if (strArray[i] != ' ')
		 		{
		 			swithoutspaces+=strArray[i];
		 		}
		 	}
		 	
		 	//System.out.println(swithoutspaces);
		 	
		 
	 }
	 
	 static void findduplicates(String s)
	 {
	 	
	 	s = s;
	 	HashMap<Character, Integer> charcountmap = new HashMap<Character, Integer>();
	 	char[] strArray = s.toCharArray();
	 	
	 	for (char c: strArray)
	 	{
	 		if (charcountmap.containsKey(c))
	 		{
	 			charcountmap.put(c, charcountmap.get(c)+1);
	 		}
	 		else 
	 		{
	 			charcountmap.put(c, 1);
	 		}
	 		 			 		 	
	 	}
	 	
	 	Set<Character> charsInString = charcountmap.keySet();
	 	
	 	for (Character c:charsInString)
	 	{
	 		if (charcountmap.get(c)>1) 
	 		{
	 			System.out.println(c +" : "+ charcountmap.get(c));
	 		}
	 	}
	 	 
	 }
	 
	 static void reverse(String s)
	 {
		 s =s;
		 
		 	char[] strArray = s.toCharArray();
		 	String reverse="";
		 	for (int i = (strArray.length-1); i>= 0; i--)
		 	{
		 		
		 		reverse+=strArray[i];
		 		
		 	}
		 	System.out.println(reverse);
		 	
	 } 	
	
		 	
}



