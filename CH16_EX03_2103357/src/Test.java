//���׸� Ŭ���� / �޼��� Ÿ������
class A{}
class B extends A {}
class C extends B {}

class D<T> {
	
}
class E<T extends B> {
	
}

class F{
	<T> void fff1(T t) {
		// System.out.println(t.length()); //�Ұ���
	}
	
	<T extends String> void fff2(T t) {
		System.out.println(t.length());
	}
}

public class Test {
	public static void main(String[] args) { 
		D<A> d1 = new D<>();
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D<String> d4 = new D<>();
		D<Object> d5 = new D<>();
		
//		E<A> e1 = new E<>();
		E<B> e2 = new E<>();
		E<C> e3 = new E<>();
//		E<String> e4 = new E<>();
//		E<Object> e5 = new E<>();
		
		F f = new F ();
		f.<String>fff1("�ȳ�");
		f.<Integer>fff1(3);
		f.<Double>fff1(3.5);
		
		f.<String>fff2("�ȳ�");
//		f.<Integer>fff2(3);
//		f.<Double>fff2(3.5);
		
		
	}
}

