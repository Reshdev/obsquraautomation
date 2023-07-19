package abstractEg;

public class NormalClass extends AbstractClass
{
	public void print()//definition of abstract method--same method name as abstract method
	{
		System.out.println("abstact method");
	}

	public static void main(String[] args) {
		NormalClass obj=new NormalClass();
		obj.print();
		obj.display();
		//AbstractClass=new AbstractClass();
		//ob.print();
		//ob.display();
		// TODO Auto-generated method stub

	}

}
