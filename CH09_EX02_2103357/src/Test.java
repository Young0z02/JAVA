class A {
	int m;
	static int n;
	static {
		n=5;
	}
	
	A (){
		m=3;
	}
}
public class Test {
	public static void main(String[] args) {
		
		System.out.println(A.n);
		
		A a = new A ();
		System.out.println(a.m);
		System.out.println(a.n);
	}

}
