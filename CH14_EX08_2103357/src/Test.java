
public class Test {
	public static void main(String[] args) { //throws Exception
		try {
			throw new Exception(); //일반예외 객체 생성 후 던지기(throw)
		}
		catch(Exception e) {
			System.out.println(e.getMessage()); //null
		}
		
		try {
			throw new Exception("10보다 큰 숫자가 들어왔습니다."); //일반예외 객체 생성 후 던지기(throw)
		}
		catch(Exception e) {
			System.out.println(e.getMessage()); // getMessage 출력
		}
		
		try {
			int b=80;
			if(b<0) {
				throw new Exception("음수가 들어왔습니다.");
			} 
		else if (b>100) {
			throw new Exception("100보다 큰 수가 들어왔습니다.");
			}
			System.out.println("당신의 점수는 " + b + "점입니다.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
