class A {
	void abc() throws ClassNotFoundException {
		bcd();
	}
	void bcd() throws ClassNotFoundException {
		cde();
	}
	void cde() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object2"); //�ƹ� ����� �� ��� -> �ڹ� �ȿ� java.lang.Object�� �ֱ� ����
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
		
		
		System.out.println("���α׷� ��� ����");
	}

}
