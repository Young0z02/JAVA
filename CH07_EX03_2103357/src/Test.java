//�⺻ ������ �� �ѱ�� (call by value)

public class Test {
	public static void main(String[] args) {
		int a=3;
		int k1=abc(3); //abc�� static�� �ƴϱ� ������ �׳� abd(3) ���� ����
		int k2=abc(a);
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(a); //���� �޼��� a�̹Ƿ� 3���
	}
	static int abc(int a) {
		a=a*2;
		return a;
	}

}
