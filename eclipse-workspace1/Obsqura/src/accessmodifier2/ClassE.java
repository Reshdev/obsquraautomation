package accessmodifier2;

public class ClassE {
	

	public static void main(String[] args) {
		ClassD obj=new ClassD();
		obj.display();
		// not visible----System.out.println(obj.p);
		System.out.println(obj.q);
		System.out.println(obj.r);
		// TODO Auto-generated method stub

	}

}
