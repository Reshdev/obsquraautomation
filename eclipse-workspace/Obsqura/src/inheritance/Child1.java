package inheritance;

public class Child1 extends Parent1 {
	int p=34;
	int q=23;

	public void sub()
	{
		int r=p-q;
		System.out.println(r);
	}

	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.sub();
		obj.mul();
		obj.div();
		// TODO Auto-generated method stub

	}

}
