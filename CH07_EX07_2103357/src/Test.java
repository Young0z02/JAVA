//생성자
class A{
	int m;
	void abc() {
		
	}
//	A(){ //컴파일러가 만들어 주는 생성자
//		
//	}
}
class B {
	int m;
	void abc() {
		
	}
	B(){ //직접만든 기본 생성자.
		
	}
}
class C{
	int m;
	void abc() {
		
	}
	C(int k){
		
	}
}
public class Test {
	public static void main(String[] args) {
		//#1. 객체생성
		A a = new A(); //컴파일러가 기본 생성자를 생성해줌
		B b = new B();
//		C c = new C(); //오류발생 (기본생성자 없음)
		C c = new C(3);
		
	}
}
