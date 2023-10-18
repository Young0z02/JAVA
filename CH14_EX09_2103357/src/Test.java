class A {
	void abc() throws ClassNotFoundException {
		bcd();
	}
	void bcd() throws ClassNotFoundException {
		cde();
	}
	void cde() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object2"); //아무 결과가 안 뜬다 -> 자바 안에 java.lang.Object가 있기 때문
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A ();
		
		try {
			a.abc();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("프로그램 계속 진행");
	}

}
