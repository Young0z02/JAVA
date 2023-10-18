//#1. 인스턴스 이너클래스
class A {
	int a=3;
	static int b=5;
	
	static class B { //인스턴스 멤버 이너클래스 //생성되는 .class 이름은  : A$B.class 
		void bbb() {
//			System.out.println(a); //static 안에서는 static 사용가능
			System.out.println(b);
		}
	}
}
public class Test {
	public static void main(String[] args) {
		
		//인스턴스 멤버 이너클래스 객체 생성하고 메서드 호출해라.
		
		//#1. 아웃터 클래스의 객체 바로 생성
		A.B ab = new A.B();
	
		//#2. 이너클래스 매서드 호출
		ab.bbb();
	}

}
