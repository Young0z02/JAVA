
public class Test {
	public static void main(String[] ar) {
		
		//Chap2 ����
		byte a =10;
//		byte b = 128 ���� (���� ������ ����� int�� �ν�)
		long c = 10; //�ڵ� ��ĳ����
//		float d = 5.8; //float = double ���� (�ٿ�ĳ������ ���� ���־�� �� ) (������ �ذ��ϰ� ������ �ڿ� F�� �ۼ�)
		
		char e = 'A';
		System.out.println(e); //A
		char f = 66;
		System.out.println(f); //B
		double g = 5;
		System.out.println(g); //5.0
		
		//��������� (+, -, *, /, %)
		System.out.println(2+3.5);
		System.out.println(2-3.5);
		System.out.println(2*3);
		System.out.println(3/2);
		System.out.println(10%3);
		
		//����������
		int m1=3;
		int m2=4;
		m1++;
		System.out.println(m1);
		++m2;
		System.out.println(m2);
		
		int m3 = ++m1;
		System.out.println(m1);
		System.out.println(m3);
		int m4 = m2++;
		System.out.println(m2);
		System.out.println(m4);
		
		int k=5;
		System.out.println(k++);
		System.out.println(++k);
		System.out.println(k--);
		System.out.println(k);
		
		
	}

}
