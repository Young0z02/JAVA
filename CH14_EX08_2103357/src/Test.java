
public class Test {
	public static void main(String[] args) { //throws Exception
		try {
			throw new Exception(); //�Ϲݿ��� ��ü ���� �� ������(throw)
		}
		catch(Exception e) {
			System.out.println(e.getMessage()); //null
		}
		
		try {
			throw new Exception("10���� ū ���ڰ� ���Խ��ϴ�."); //�Ϲݿ��� ��ü ���� �� ������(throw)
		}
		catch(Exception e) {
			System.out.println(e.getMessage()); // getMessage ���
		}
		
		try {
			int b=80;
			if(b<0) {
				throw new Exception("������ ���Խ��ϴ�.");
			} 
		else if (b>100) {
			throw new Exception("100���� ū ���� ���Խ��ϴ�.");
			}
			System.out.println("����� ������ " + b + "���Դϴ�.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
