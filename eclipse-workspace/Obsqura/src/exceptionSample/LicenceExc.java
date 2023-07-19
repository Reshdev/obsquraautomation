package exceptionSample;

public class LicenceExc {
	public void test(int age) throws LicenceException 
	{
		if(age<=18)
		{
			throw new LicenceException("not eligible");
			//System.out.println();
		}
		else
		{
			System.out.println("eligible");
		}
	}

	public static void main(String[] args) {
		LicenceExc ob=new LicenceExc();
		try {
			ob.test(15);
		} catch (LicenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
