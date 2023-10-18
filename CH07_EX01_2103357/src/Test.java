//메서드
class A{ //메서드만 4개인 클래스
	void abc() {
		System.out.println("안녕");
	}
	int bcd() {
		int a=3;
		int b=5;
		abc(); //내부 메서드 호출(소속을 표기 생략 가능)
		return a+b;
		
	}
	double cde(int k) {
		return k*0.5; //참고, int를 리턴하면 int->double로 자동캐싱(컴파일러가 자동 업캐스팅)
	}
	void def(int k) {
		if(k>0) {
			System.out.println("음수");
		} else {
			System.out.println("양수");//양수 출력 후 메서드 종료까지 출력 (return이 없기 대문)
		}
		System.out.println("메서드 종료");
	}
}



//외부 글래스에서 메서드 활용
public class Test {
	public static void main(String[] args) {
		//#1. 객체 생성
		A a = new A();
	
		//메서드 호출
		// a.abc();
		// a.bcd();
		//여기까지 출력하라 --> 안녕
		a.abc();
		int k = a.bcd();
		System.out.println(k);
		System.out.println(a.bcd());
		
		a.cde(3); //출력 X
		System.out.println(a.bcd());
		
		a.def(-2);
		a.def(5);
	}

}
