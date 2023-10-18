//#1. 인스턴스 이너클래스
class A {
	int a=3; //생성되는 .class 이름은  : A.class 
	int b=5;
	int c=12;
	
	class B { //인스턴스 멤버 이너클래스 //생성되는 .class 이름은  : A$B.class 
		int a=7; 
		int b=9;
		int d=11;
		void bbb() {
		
			System.out.println(a); //this
			System.out.println(b); //this
			System.out.println(c); //A.this
			System.out.println(d); //this
			
			System.out.println(this.a);
			System.out.println(this.b);
			
			System.out.println(A.this.a);
			System.out.println(A.this.b);
		}
	}
}
public class Test {
	public static void main(String[] args) {
		
		//인스턴스 멤버 이너클래스 객체 생성하고 메서드 호출해라.
		
		//#1. 아웃터 클래스의 객체 생성
		A a = new A();
		//#2. 이너클래스 객체 생성
		A.B b = a.new B ();
		//#3. 이너클래스 매서드 호출
		b.bbb();
	}

}
