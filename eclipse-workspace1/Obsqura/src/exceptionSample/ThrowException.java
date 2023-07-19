package exceptionSample;

public class ThrowException {
	public static void testthrow(int age)
	{
		if(age<18)
		{
			//System.out.println(" not eligible for vote");
			throw new ArithmeticException("Not Eligible for vote");
		}else
		{
			System.out.println(" eligible for vote");
		}
	}

	public static void main(String[] args) {
		ThrowException.testthrow(4);
		// TODO Auto-generated method stub

	}

}
