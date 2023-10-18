class A {
	A() {
		System.out.println("A 객체 생성");
	}
}

class B{
	B(){
		super();
		System.out.println("B 객체 생성");
	}
}

class C {
	C(int a){
		System.out.println("C 객체 생성");
	}
}
class D extends C {
	D(){
		super(3);
		System.out.println("D 객체 생성");
	}
}

//		super(); //컴파일러가 써주는 슈퍼 / C를 호출 - 위에 상속을 못 해서 오류남
//	}
public class Test {
	public static void main(String[] args) {
		A a = new A (); //
		B b = new B (); //
	}

}
