
public class Test {
	public static void main(String[] args) {
		//�⺻�ڷ��� vs �����ڷ���
		//�⺻�ڷ���
		int a=3;
		int b=a;
		b=7;
		System.out.println(a); //3
		System.out.println(b); //7
		
		//�����ڷ���
		int[] c= {2,3,4};
		int[] d=c;
		d[0]=7;
		System.out.println(c[0]);
		System.out.println(d[0]);
	}

}
