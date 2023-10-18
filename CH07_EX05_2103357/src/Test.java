
//# 메서드 오버로딩
class A{
	void abc() {
		System.out.println("A");
	}
	void abc(int a) {
		System.out.println("B");
	}
	void abc(double b) {
		System.out.println("C");
	}
	void abc(int a, int b) {
		System.out.println("D");
	}
	void abc(int a, double b) {
		System.out.println("E");
	}	
//	int abc(int a) { //오버로딩 불가능
//		System.out.println("B");
//		return 3;
//	}	
//	void abc(int k) { //오버로딩 불가능
//		System.out.println("B");
//	}
}


public class Test {
	public static void main(String[] args) {
		//#1 객체생성 
		A a = new A();
		
		//#2 메서드 호출
		a.abc(5.8);
		a.abc(3);
		a.abc();
		a.abc(1,2);
		a.abc(5,1.5);
	}

}