import javax.swing.AbstractCellEditor;

abstract class A {
	abstract void abc();
}

class B extends A{
	@Override
	void abc() {
		System.out.println("B");		
	}
}
abstract class C {
	abstract void cde();
	abstract void def();
}

public class Test {
	public static void main(String[] args) {
		//#추상클래스타입의 객체 만들기 2가지 방법
		
		//#방법 1. 자식 클래스 생성
		A a1 = new B();
		a1.abc(); //B
		
		//#방법 2. 익명이너클래스 사용
		A a2 = new A () {
			@Override
			void abc() {
				System.out.println("C");
				
			}
			
		};
		a2.abc();//C
		
		
		C c = new C() {
			
			@Override
			void cde() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			void def() {
				// TODO Auto-generated method stub
				
			}
			
		}; 
	}

}
