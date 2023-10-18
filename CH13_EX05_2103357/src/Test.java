class A {
	int a =3;
	void abc() {
		int b=5;
		class B { //A$1B.class
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a=7;
				//b=7; // 자동으로 final로 변환되어서 오류 발생
			}
		}
		//지역이너클래스가 사용될 수 있는 유일한 공간
		B bb=new B();
		bb.bcd();
	}
}



public class Test {
	public static void main(String[] args) {
		
	}

}
