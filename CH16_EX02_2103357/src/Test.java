//���׸� �޼���

class A {
	<T >void abc(T t) {
		System.out.println(t);
		//���׸� �޼��� ���ο����� Object �޼��常 ��� ����
		//System.out.println(t.length());
	}
	
	<K,V> void bcd(K k, V v) {
		System.out.println(k);
		System.out.println(v);
	}
	
	<T> T cde(T t){
		return t;
	}
}



public class Test {
	public static void main(String[] args) {
		A a= new A();
		
		a.<String>abc("�ȳ�");
		a.abc("�ȳ�");
//		System.out.println("�ȳ�", length());
		
		a.<String, Double> bcd ("�氡", 5.3);
		a.bcd("�氡", 5.3);
		
		String str = a.<String> cde("�ȳ�");
		int b = a.<Integer>cde(3);
		
		String str = a.<String>cde("�ȳ�");
		int b = a.<Integer>cde(3);
		
		Integer c = 3;
		
		
		
	}
}



