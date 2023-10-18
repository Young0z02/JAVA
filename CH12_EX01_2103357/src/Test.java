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
		//#�߻�Ŭ����Ÿ���� ��ü ����� 2���� ���
		
		//#��� 1. �ڽ� Ŭ���� ����
		A a1 = new B();
		a1.abc(); //B
		
		//#��� 2. �͸��̳�Ŭ���� ���
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
