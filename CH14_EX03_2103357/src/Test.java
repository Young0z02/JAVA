public class Test {
	public static void main(String[] args) {
		int a=3;
		int b=1;
		
		try {
			System.out.println(a/b);
			System.out.println("AAAAA");
		}
		catch(ArithmeticException e) {
			System.out.println("���ܹ߻�");
			System.out.println("AAAAA");
		}
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("���ܹ߻�");			
		}
		finally {
			System.out.println("AAAAA");
		}
		
		
		
		
	}
}