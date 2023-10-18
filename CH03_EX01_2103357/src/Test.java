
public class Test {
	public static void main(String[] ar) {
		
		//Chap2 복습
		byte a =10;
//		byte b = 128 오류 (값의 범위가 벗어나서 int로 인식)
		long c = 10; //자동 업캐스팅
//		float d = 5.8; //float = double 형태 (다운캐스팅을 직접 해주어야 함 ) (오류를 해결하고 싶으면 뒤에 F를 작성)
		
		char e = 'A';
		System.out.println(e); //A
		char f = 66;
		System.out.println(f); //B
		double g = 5;
		System.out.println(g); //5.0
		
		//산술연산자 (+, -, *, /, %)
		System.out.println(2+3.5);
		System.out.println(2-3.5);
		System.out.println(2*3);
		System.out.println(3/2);
		System.out.println(10%3);
		
		//증감연상자
		int m1=3;
		int m2=4;
		m1++;
		System.out.println(m1);
		++m2;
		System.out.println(m2);
		
		int m3 = ++m1;
		System.out.println(m1);
		System.out.println(m3);
		int m4 = m2++;
		System.out.println(m2);
		System.out.println(m4);
		
		int k=5;
		System.out.println(k++);
		System.out.println(++k);
		System.out.println(k--);
		System.out.println(k);
		
		
	}

}
