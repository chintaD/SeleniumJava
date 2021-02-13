package javaselfrmart01;

public class callinClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Student stu1 = new Student();
		Student stu2 = new Student();
		stu1.setAge(15);
		stu1.setId(12);
	    Student.affiliatedUniv = "Shivaji Univ";
		stu1.setName("Chintamani Deshpande");
		
		stu2.setAge(16);
		stu2.setId(11);
		stu2.setName("Ashutosh Deshpande");
		stu2.setGrade("A+");
		
		/*
		 * System.out.println(stu1.getAge()); 
		 * System.out.println(stu1.getId());
		 * System.out.println(stu1.getName());
		 */
		
		System.out.println(stu1.getName() + " a " + stu1.getAge() + " years old student is member of " +Student.affiliatedUniv) ;
		System.out.println(stu2.getName() + " a " + stu2.getAge() + " years old student is member of " +Student.affiliatedUniv + " got grade" + stu2.getGrade()) ;
		
	}

}
