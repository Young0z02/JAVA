
public class Test {
	public static void main(String[] args) {
		int a=3;
		int b=1;
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("���� �߻�");
		}
		try {
			System.out.println("10A");
		}
		catch(NumberFormatException e) {
			System.out.println("���ܹ߻�");
		}
		
		//------------------------------------------------------
		try {
			System.out.println(a/b);
			System.out.println(Integer.parseInt("10A"));
		}
		catch(ArithmeticException e) {
			System.out.println("���� �߻�");
		}
		catch(NumberFormatException e) {
			System.out.println("���ܹ߻�");
		}
		
		
		//----------------------------------------------------------
		try {
			System.out.println(a/b);
			System.out.println(Integer.parseInt("10A"));
		}
		catch(ArithmeticException | NumberFormatException e) {
			System.out.println("���� �߻�");
		}
		
		
	}

}
