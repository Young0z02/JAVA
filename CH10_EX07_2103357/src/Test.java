class A {
	int m;
	A(int m) {
		this.m=m;
	}
}

class B {
	int m;
	B(int m) {
		this.m=m; // 내 객체 뱃속에 있는 m  멤버 : int m (파란색)
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		// 필드값이 동일하면 true / 다르면 false
		if(obj instanceof B) { //obj가 B로 캐스팅이 가능할 때만 캐스팅해라
			result = (this.m ==((B)obj).m);
		}	
		return result;
	}
}

public class Test {
	public static void main(String[] args) {
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1==a2); //false
		System.out.println(a1.equals(a2));
		
		B b1 = new B(5);
		B b2 = new B(5);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}

}
