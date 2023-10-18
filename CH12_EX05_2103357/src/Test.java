interface A {
	void abc();
	default void bcd() {
		System.out.println("인터페이스의 디폴트 메서트");
	}
}

class B implements A {

	@Override
	public void abc() { //public 이 꼭 있어야함
		System.out.println("B 클래스내에서 구현한 메서드");
	}
}

class C implements A {

	@Override
	public void abc() { //public 이 꼭 있어야함
		System.out.println("C 클래스내에서 구현한 메서드");
		bcd(); //아래 오버라이딩을 호출
		A.super.bcd(); //interface A 호출
	}
	@Override
	public void bcd() {
		System.out.println("C 클래스 내에서 오버라이딩한 메서드");
		A.super.bcd();
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new B ();
		a.abc();
		a.bcd();
		
		A a2= new C();
		a2.abc();
		//a2.bcd();
	}

}


interface D {
	default void def() {
		System.out.println("D");
	}
}

interface E {
	default void def() {
		System.out.println("E");
	}
}

class F {
	void def() {
		System.out.println("F");

	}
}

class G extends F implements D,E {
	void abc() {
		//미션, 출력 결과가 G,D,E,F
	}
	public void def() {
		System.out.println("G");
	}
}


// D,E,F .super.def()