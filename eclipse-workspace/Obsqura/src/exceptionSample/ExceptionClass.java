package exceptionSample;

public class ExceptionClass {
	public void display()
	{
		int a=34;
		int b=a/0;
		System.out.println(b);
	}

	public static void main(String[] args) {
		ExceptionClass ob=new ExceptionClass();
		System.out.println("before excetion");
		ob.display();
		System.out.println("after exception");
		// TODO Auto-generated method stub

	}

}
