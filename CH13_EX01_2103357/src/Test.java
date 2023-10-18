//#1. 인스턴스 이너클래스
class A { //인스턴스 멤버 이너클래스 // 생성되는 .class 이름은 A.class
	int a=3;
	int b=5;
	void abc() {
		System.out.println("A의 메서드1");
	}
	void bcd() {
		System.out.println("A의 메서드2");
	}
	class B { //인스턴스 멤버 이너클래스 //생성되는 .class 이름은 : A$B.class 
		void bbb() {
			System.out.println(a);
			System.out.println(b);
			abc();
			bcd();
		}
	}
}	
public class Test {
	public static void main(String[] args) {
		
		//인스턴스 멤버 이너클래스의 객체생성
		//#1, 아웃터클래스의 객체 생성
		A a = new A ();
		a.b=5; //필드 사용 
		a.abc(); //메서드 사용
		A.B b = a.new B(); //이너 클래스를 사용
		b.bbb();
	}
}
