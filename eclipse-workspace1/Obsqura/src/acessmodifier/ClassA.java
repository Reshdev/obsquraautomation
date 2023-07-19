package acessmodifier;

public class ClassA {
	private int a=10;
	protected char b='s';
	int d=23;//default accessmodifier
	
public void display()
{
	System.out.println("public");
}
public static void main(String args[])
{
	ClassA ob=new ClassA();
	System.out.println(ob.a);
	System.out.println(ob.b);
	System.out.println(ob.d);
	}
}
