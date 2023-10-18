class A{
	A(){
		System.out.println("A");
	}
	A(int a){
		this(2,3);
		System.out.println("B");
	}
	A(double a){
		this(3);
		System.out.println("C");
	}
	A(int a, int b){
		this();
		System.out.println("D"); 
	} 
}
public class Test {
	public static void main(String[] ar) {
		A a1 = new A(); //A
		A a2 = new A(3.2); // ADBC
		A a3 = new A(5); // ADB
		A a4 = new A(2,3); //AD
		
	}
}
