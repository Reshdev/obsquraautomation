package encapsulation_sample;

public class Encapsulation1 {
	private String name;
	private int age;
	
	public void setter(String name , int age)
	{
		this.name= name;
		this.age= age;
		
		
	}
	public void getter()
	{
		System.out.println(name);
		age= age*10;
		System.out.println(age);
		
	}

}
