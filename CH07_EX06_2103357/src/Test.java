import java.util.Arrays;

//���� ���� �Ű�����
class A{
	void abc() {
		System.out.println("");
	}
	void abc(int a) {
		System.out.println(a);
	}
	void abc(int a, int b) {
		System.out.println(a+" "+b);
	}
	void abc(int a, int b, int c) {
		System.out.println(a+" "+b+" "+c);
	}
	
	
	void bcd(int... a) {
		System.out.println(Arrays.toString(a));
	}
	
	//�ٸ� �Ű������� �������� �Ű������� �Բ�����ϴ� ���
	//�������� �Ű������� �ݵ�� �������� �;� ��.
	void cde(double a, String b, int... c) {
		System.out.println(Arrays.toString(c));
	}
}
public class Test {
	public static void main(String[] args) {
		
		//#1. ��ü ����
		A a = new A ();
		//#2.�޼��� ȣ��
		a.abc();
		a.abc(1);
		a.abc(1,2);
		a.abc(1,2,3);
		
		a.bcd();
		a.bcd(1);
		a.bcd(1,2);
		a.bcd(1,2,3);
		a.bcd(1,2,3,4);
		
		a.cde(5.8, "�ȳ�");
		a.cde(5.8, "�ȳ�", 1);
		a.cde(5.8, "�ȳ�", 1,2);
		a.cde(5.8, "�ȳ�", 1,2,3);
		a.cde(5.8, "�ȳ�", 1,2,3,4); //cde�� ���� ������ �ƴ�. ���� ������
	}

}
