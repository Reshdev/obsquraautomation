package accessmodifier2;

public class ClassD {
	private char p= 'M';
	protected int q=48;
	float r=45.7f;
public void display()
{
	System.out.println("MALU");//public
}
public static void main(String args[]) 
{
	ClassD obj=new ClassD();
	System.out.println(obj.p);
	System.out.println(obj.q);
	System.out.println(obj.r);
}
}
