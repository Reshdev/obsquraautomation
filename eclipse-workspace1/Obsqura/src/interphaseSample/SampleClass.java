package interphaseSample;

public class SampleClass implements Sample1{
	public void display()
	{
		System.out.println("DISPLAY");
	}
	
    public void add()
    {
    	int c=a+b;
    	System.out.println(c);
    }
    public void print()
    {
    	System.out.println("METHOD IN CLASS");
    }
	public static void main(String[] args) {
	SampleClass ob=new SampleClass();
		//Sample1 ob=new SampleClass();//object of interphase
	ob.display();
	ob.add();
	ob.print();
	System.out.println(ob.a);
	System.out.println(ob.b);
	// TODO Auto-generated method stub

	}

}
