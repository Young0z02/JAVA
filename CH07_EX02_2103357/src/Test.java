//���� ��� �޼��� ȣ��
class A{
	void abc() {
		System.out.println("�޼��� abc");
		bcd(); //�޼��� bcd
		cde(); //static �޼��� cde
	}
	void bcd() {
		System.out.println("�޼��� bcd");
	}
	static void cde() {
		System.out.println("static �޼��� cde");
		//abc(); //static�޼��忡���� static �޼��常 ȣ�� ����
	}
	static void def() {
		System.out.println("static �޼��� def");
	}
}
public class Test {
	public static void main(String[] args) { //�ܺ�Ŭ���� ȣ��ÿ��� static ���� ��� ����
		abc();
		
		A a = new A();
		a.abc();
		a.bcd();
		a.cde();
		a.def();
	}
	static void abc() {
		System.out.println("TestŬ������ abc�޼���");
		
	}
	void bcd() {
		A a = new A ();
		a.abc();
		a.bcd();
		a.cde();
		a.def();
	}
}
