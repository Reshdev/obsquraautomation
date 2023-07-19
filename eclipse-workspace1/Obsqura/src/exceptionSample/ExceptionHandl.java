package exceptionSample;
public class ExceptionHandl {
	public void display()
	{
		int a=34;
		try {
		int b=a/0;
		System.out.println(b);
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
			System.out.println(e);
		}
		finally {System.out.println("finally block");}
		}
	

	public static void main(String[] args) {
		ExceptionHandl ob=new ExceptionHandl();
		
		ob.display();
		
		// TODO Auto-generated method stub

	}


}
