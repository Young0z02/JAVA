interface A{
	int m=3;
	void abc();
}

class B implements A{
	@Override
	public void abc() {
		System.out.println("B");
		
	}
}
public class Test {
	public static void main(String[] args) {
		//인터페이스의 객체를 만드는 2가지 방법
		
		//#방법 1. 자식클래스 직접생성
		A a1 = new B();
		
		//#방법 2. 익명이너클래스 사용
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("C");
				
			}
		};
	}

}
