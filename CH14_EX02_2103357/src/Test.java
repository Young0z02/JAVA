class A{}
class B extends A{}

public class Test {
	public static void main(String[] args) {
		//���࿹��(unchecked exception = Runtime Exception)
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			
		}
		try {
			int a = Integer.parseInt("10A");
		}
		catch(NumberFormatException e) {
			System.out.println("���ڷ� ������ �� �����ϴ�.");
		}
		
		int[] b = {1,2,3};
		try {
			System.out.println(b[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� ������ϴ�.");
		}

		try {		
			A aa = new A();
			B bb = (B)aa;
		}
		catch(ClassCastException e) {
			System.out.println("ĳ������ �Ұ����մϴ�.");
		}
		
		try {
			String s = null;
			System.out.println(s.charAt(1));
		}
		catch(NullPointerException e) {
			System.out.println("��ü�� Null�Դϴ�.");
		}
		


		
		
		System.out.println("���α׷� ��� ����");
		
		
	}
}
