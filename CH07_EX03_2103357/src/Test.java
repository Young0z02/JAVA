//기본 차료형 값 넘기기 (call by value)

public class Test {
	public static void main(String[] args) {
		int a=3;
		int k1=abc(3); //abc가 static이 아니기 때문에 그냥 abd(3) 쓰면 오류
		int k2=abc(a);
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(a); //메인 메서드 a이므로 3출력
	}
	static int abc(int a) {
		a=a*2;
		return a;
	}

}
