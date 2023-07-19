package acessmodifier;

public class ClassB {

	public static void main(String[] args) {
		ClassA obj=new ClassA();
				obj.display();
				//System.out.println(obj.a); not visible because classA is private
		System.out.println(obj.b);// TODO Auto-generated method stub
        System.out.println(obj.d);
	}

}
