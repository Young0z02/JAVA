class A{}
class B extends A{}

public class Test {
	public static void main(String[] args) {
		//실행예외(unchecked exception = Runtime Exception)
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			
		}
		try {
			int a = Integer.parseInt("10A");
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 변경할 수 없습니다.");
		}
		
		int[] b = {1,2,3};
		try {
			System.out.println(b[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 벗어났습니다.");
		}

		try {		
			A aa = new A();
			B bb = (B)aa;
		}
		catch(ClassCastException e) {
			System.out.println("캐스팅이 불가능합니다.");
		}
		
		try {
			String s = null;
			System.out.println(s.charAt(1));
		}
		catch(NullPointerException e) {
			System.out.println("객체가 Null입니다.");
		}
		


		
		
		System.out.println("프로그램 계속 진행");
		
		
	}
}
