interface A {
	void abc();
}

//#방법 1-1. 자식 클래스 만들기
class B implements A {
	@Override
	public void abc() {
		System.out.println("B");
	}
}
	
	
public class Test {
	public static void main(String[] args) {
		
		//#인터페이스 타입의 객체를 생성하라. (두 가지 방법)
		//방법 1-2, 자식클래스로 생성하기
		A a1 = new B();
				
		//방법 2, 익명이너클래스로 만드는 방법		
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("익명이너클래스");
				
			}
		};
		a1.abc();
		a2.abc();   
	

	}
}
