//제네릭 메서드

class A {
	<T >void abc(T t) {
		System.out.println(t);
		//제네릭 메서드 내부에서는 Object 메서드만 사용 가능
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
		
		a.<String>abc("안녕");
		a.abc("안녕");
//		System.out.println("안녕", length());
		
		a.<String, Double> bcd ("방가", 5.3);
		a.bcd("방가", 5.3);
		
		String str = a.<String> cde("안녕");
		int b = a.<Integer>cde(3);
		
		String str = a.<String>cde("안녕");
		int b = a.<Integer>cde(3);
		
		Integer c = 3;
		
		
		
	}
}



