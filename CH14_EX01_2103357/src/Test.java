import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

//과정을 봐야 함
public class Test {
	public static void main(String[] args) {
		//일반 예외(checked exception) - 문법을 체크
		try {
		Thread.sleep(1000); //우회도를 만들어 줘야함 - 예외처리 해결 : try - catch 예외가 발생하면 -catch 블록을 만들어라
		}
		catch(InterruptedException e) { //예외처리를 한 상태임 - catch를 실행해라
			System.out.println("예외발생");
		}
		// Class cls = Class.forName("java.lang.Object"); //Object 는 관심이 없음 - forname은 못 찾을 때도 있으니까 아래 대책을 만들어라
		
		try {
		Class cls = Class.forName("java.lang.Object2"); //찾지 못 해서 죽어야 될 상황 - 강제가 되기 떄문에 아래 블럭을 만들어야 함
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다");
		}
		try {
		FileInputStream fis = new FileInputStream("file.txt");
		}
		catch(FileNotFoundException e) {
		
		}
		
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			isr.read();
		} catch (IOException e) { //catch 블럭을 만드는 것이 예외처리 - 안에 만드는 것이 아님
			
		}
		
	}
}