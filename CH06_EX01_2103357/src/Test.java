//1.package
//2.import
//3.class (#�ܺ� Ŭ������ public���� ������ �� ����

class A {
	int m;
	void printData() {
		System.out.println("�ȳ�"+m);
	}
}

public class Test {
	
	//#4���� �ʵ�/�޼���/������/�̳�Ŭ����
	public static void main(String[] args) {		
	//��ü ����
		A a1 = new A();
		A a2 = new A();
		System.out.println(a1.m);
		System.out.println(a2.m);
		a1.m=5;
		a2.m=7;
		System.out.println(a1.m);
		System.out.println(a2.m);
		a1.printData();
		a2.printData();
		
		
	}

}