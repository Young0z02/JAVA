import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

//������ ���� ��
public class Test {
	public static void main(String[] args) {
		//�Ϲ� ����(checked exception) - ������ üũ
		try {
		Thread.sleep(1000); //��ȸ���� ����� ����� - ����ó�� �ذ� : try - catch ���ܰ� �߻��ϸ� -catch ����� ������
		}
		catch(InterruptedException e) { //����ó���� �� ������ - catch�� �����ض�
			System.out.println("���ܹ߻�");
		}
		// Class cls = Class.forName("java.lang.Object"); //Object �� ������ ���� - forname�� �� ã�� ���� �����ϱ� �Ʒ� ��å�� ������
		
		try {
		Class cls = Class.forName("java.lang.Object2"); //ã�� �� �ؼ� �׾�� �� ��Ȳ - ������ �Ǳ� ������ �Ʒ� ���� ������ ��
		}
		catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ ã�� �� �����ϴ�");
		}
		try {
		FileInputStream fis = new FileInputStream("file.txt");
		}
		catch(FileNotFoundException e) {
		
		}
		
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			isr.read();
		} catch (IOException e) { //catch ���� ����� ���� ����ó�� - �ȿ� ����� ���� �ƴ�
			
		}
		
	}
}