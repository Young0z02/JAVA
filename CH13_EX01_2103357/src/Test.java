//#1. �ν��Ͻ� �̳�Ŭ����
class A { //�ν��Ͻ� ��� �̳�Ŭ���� // �����Ǵ� .class �̸��� A.class
	int a=3;
	int b=5;
	void abc() {
		System.out.println("A�� �޼���1");
	}
	void bcd() {
		System.out.println("A�� �޼���2");
	}
	class B { //�ν��Ͻ� ��� �̳�Ŭ���� //�����Ǵ� .class �̸��� : A$B.class 
		void bbb() {
			System.out.println(a);
			System.out.println(b);
			abc();
			bcd();
		}
	}
}	
public class Test {
	public static void main(String[] args) {
		
		//�ν��Ͻ� ��� �̳�Ŭ������ ��ü����
		//#1, �ƿ���Ŭ������ ��ü ����
		A a = new A ();
		a.b=5; //�ʵ� ��� 
		a.abc(); //�޼��� ���
		A.B b = a.new B(); //�̳� Ŭ������ ���
		b.bbb();
	}
}
