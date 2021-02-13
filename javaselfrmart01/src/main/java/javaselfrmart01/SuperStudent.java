package javaselfrmart01;

public class SuperStudent {
	
	private int Id;
	private int Age;
	public static String affiliatedUniv = "Pune Univ";
	private String 	Grade;
   	
	protected String getGrade() {
		return Grade;
	}
	void setGrade(String grade) {
		Grade = grade;
		System.out.println(Grade);
	}
	private String name;
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getId() {
		return Id;
	}
	protected void setId(int id) {
		Id = id;
	}
	protected int getAge() {
		return Age;
	}
	protected void setAge(int age) {
		Age = age;
	}
	
	
	
	
	
	
}
