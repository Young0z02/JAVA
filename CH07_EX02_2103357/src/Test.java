//내부 멤버 메서드 호출
class A{
	void abc() {
		System.out.println("메서드 abc");
		bcd(); //메서드 bcd
		cde(); //static 메서드 cde
	}
	void bcd() {
		System.out.println("메서드 bcd");
	}
	static void cde() {
		System.out.println("static 메서드 cde");
		//abc(); //static메서드에서는 static 메서드만 호출 가능
	}
	static void def() {
		System.out.println("static 메서드 def");
	}
}
public class Test {
	public static void main(String[] args) { //외부클래스 호출시에는 static 여부 상관 없음
		abc();
		
		A a = new A();
		a.abc();
		a.bcd();
		a.cde();
		a.def();
	}
	static void abc() {
		System.out.println("Test클래스의 abc메서드");
		
	}
	void bcd() {
		A a = new A ();
		a.abc();
		a.bcd();
		a.cde();
		a.def();
	}
}
