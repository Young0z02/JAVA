//�޼���
class A{ //�޼��常 4���� Ŭ����
	void abc() {
		System.out.println("�ȳ�");
	}
	int bcd() {
		int a=3;
		int b=5;
		abc(); //���� �޼��� ȣ��(�Ҽ��� ǥ�� ���� ����)
		return a+b;
		
	}
	double cde(int k) {
		return k*0.5; //����, int�� �����ϸ� int->double�� �ڵ�ĳ��(�����Ϸ��� �ڵ� ��ĳ����)
	}
	void def(int k) {
		if(k>0) {
			System.out.println("����");
		} else {
			System.out.println("���");//��� ��� �� �޼��� ������� ��� (return�� ���� �빮)
		}
		System.out.println("�޼��� ����");
	}
}



//�ܺ� �۷������� �޼��� Ȱ��
public class Test {
	public static void main(String[] args) {
		//#1. ��ü ����
		A a = new A();
	
		//�޼��� ȣ��
		// a.abc();
		// a.bcd();
		//������� ����϶� --> �ȳ�
		a.abc();
		int k = a.bcd();
		System.out.println(k);
		System.out.println(a.bcd());
		
		a.cde(3); //��� X
		System.out.println(a.bcd());
		
		a.def(-2);
		a.def(5);
	}

}
