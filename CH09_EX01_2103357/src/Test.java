 
public class Test {
	/*�����ʵ��� �������*/
	
	class A {
		int m=3; //�ν��Ͻ� �ʵ�
		static int n=5; //����(static) �ʵ�
	}
	public class StaticField_2 {
		public static void main(String[] args) {		
			A a1 = new A();
			A a2 = new A();
			
			//�ν��Ͻ� �ʵ�
			a1.m=5;
			a2.m=6; 		
			System.out.println(a1.m); //5
			System.out.println(a2.m); //6
			
			//�����ʵ�
			a1.n=7;
			a2.n=8;		
			System.out.println(a1.n); //8
			System.out.println(a2.n); //8
			
			A.n=9;
			System.out.println(a1.n); //9
			System.out.println(a2.n); //9
		}
	}
}
