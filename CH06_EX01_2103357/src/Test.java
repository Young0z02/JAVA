//1.package
//2.import
//3.class (#외부 클래스는 public으로 선언할 수 없다

class A {
	int m;
	void printData() {
		System.out.println("안녕"+m);
	}
}

public class Test {
	
	//#4가지 필드/메서드/생성자/이너클래스
	public static void main(String[] args) {		
	//객체 생성
		A a1 = new A();
		A a2 = new A();
		System.out.println(a1.m);
		System.out.println(a2.m);
		a1.m=5;
		a2.m=7;
		System.out.println(a1.m);
		System.out.println(a2.m);
		a1.printData();
		a2.printData();
		
		
	}

}