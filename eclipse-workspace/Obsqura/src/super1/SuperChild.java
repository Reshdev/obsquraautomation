package super1;

public class SuperChild extends SuperParent {
public void print()
	{
	    super.display();
		System.out.println("SUPER CHILD");
		System.out.println(super.a);
		System.out.println(super.b);
	}
		
public static void main(String args[]) {
	SuperChild obj=new SuperChild();
	obj.print();
	
	
	
	
		
}
	}


