package interphaseSample;

public interface Sample1 {
	public abstract void display();
	
	public static final int a=45;
	
	int b=20;//jvm convert it into final int b=20;
			
	public void add();

}
