//#interface

interface A {
	int m=3; //public static final
	void abc(); //public abstract - ������ �ȳ� : abstract Ű���尡 �پ��ٴ� �Ҹ�
}

class B implements A {

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Test {
	public static void main(String[] args) {
		System.out.println(A.m); //static �ӿ��尡 �پ��ٴ� �Ҹ�
		// A.m=5; //���� : final Ű���尡 �پ��ٴ� �Ҹ�
	}

}
