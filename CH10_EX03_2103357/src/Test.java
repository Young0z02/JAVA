class A {
	int m=3;
	static int n=4;
	void abc() {
		System.out.println("A�� �ν��Ͻ� �޼���");
	}
	static void bcd() {
		System.out.println("A�� ����ƽ �޼���");
	}
}

class B extends A {
	int m=5;
	static int n=6;
	void abc() {
		System.out.println("B�� �ν��Ͻ� �޼���");
	}
	static void bcd() {
		System.out.println("B�� ����ƽ �޼���");
	}
}




public class Test {
	public static void main(String[] args) {
		
		A aa = new A ();
		System.out.println(aa.m); // 3
		System.out.println(aa.n); // 4
		aa.abc(); // A�� �ν��Ͻ� �޼��� 
		aa.bcd(); // A�� ����ƽ �޼���
		
		
		B bb = new B ();
		System.out.println(bb.m); //5
		System.out.println(bb.n); //6
		bb.abc(); // B�� �ν��Ͻ� �޼���
		bb.bcd(); // B�� ����ƽ �޼���
		
		
		A ab = new B();
		System.out.println(ab.m); //3
		System.out.println(ab.n); //4
		ab.abc(); //B�� �ν��Ͻ� �޼���
		ab.bcd(); //A�� ����ƽ �޼���
	}

}
