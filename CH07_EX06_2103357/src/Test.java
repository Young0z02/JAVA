import java.util.Arrays;

//가변 길이 매개변수
class A{
	void abc() {
		System.out.println("");
	}
	void abc(int a) {
		System.out.println(a);
	}
	void abc(int a, int b) {
		System.out.println(a+" "+b);
	}
	void abc(int a, int b, int c) {
		System.out.println(a+" "+b+" "+c);
	}
	
	
	void bcd(int... a) {
		System.out.println(Arrays.toString(a));
	}
	
	//다른 매개변수와 가변길이 매개변수를 함께사용하는 경우
	//가변길이 매개변수는 반드시 마지막에 와야 함.
	void cde(double a, String b, int... c) {
		System.out.println(Arrays.toString(c));
	}
}
public class Test {
	public static void main(String[] args) {
		
		//#1. 객체 생성
		A a = new A ();
		//#2.메서드 호출
		a.abc();
		a.abc(1);
		a.abc(1,2);
		a.abc(1,2,3);
		
		a.bcd();
		a.bcd(1);
		a.bcd(1,2);
		a.bcd(1,2,3);
		a.bcd(1,2,3,4);
		
		a.cde(5.8, "안녕");
		a.cde(5.8, "안녕", 1);
		a.cde(5.8, "안녕", 1,2);
		a.cde(5.8, "안녕", 1,2,3);
		a.cde(5.8, "안녕", 1,2,3,4); //cde는 시험 범위가 아님. 상위 버전임
	}

}
