class MyException extends Exception {

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}
	
	
}

class A {
	void abc(int num) throws MyException{
		if (num < 70)
			throw new MyException();
	}
	void bcd() {
		try {
		abc(85);
		System.out.println("정상동작1");
		}catch(MyException e) {
			System.out.println("예외 발생1");	
		}
	}
	void cde() {
		try {
		abc(85);
		System.out.println("정상동작1");
		}catch(MyException e) {
			System.out.println("예외 발생1");
			}
		}
}
public class Test {

}
