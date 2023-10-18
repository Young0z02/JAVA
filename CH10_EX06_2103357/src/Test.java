class A {
	int m=3;
	int n=4;
}

class B {
	int m=5;
	int n=6;
	
	@Override
	public String toString() {
		String str = m + ", " + n;
		return str;
	}
}

class C {
	int m=5;
	int n=6;
	
	@Override
	public String toString() {
		return "µ¡¼À °á°ú´Â " + (m+n) + "ÀÔ´Ï´Ù.";
	}
	
}
public class Test {
	public static void main(String[] args) {
		
		A a = new A ();
		System.out.println(a.toString());
		System.out.println(a);
		
		B b = new B ();
		System.out.println(b.toString());
		System.out.println(b);
		
		C c = new C ();
		System.out.println(c); //"µ¡¼À °á°ú´Â 11ÀÔ´Ï´Ù."
	}

}
