
public class Test {
	public static void main(String[] ar) {
		//switch #1 --> if������ ��ȯ
			int a = 2;
			switch (a) {
			case 10: //System.out.println("A"); break; �����ص� �Ȱ���
			case 9:
				System.out.println("A"); break;
			case 8:
				System.out.println("B"); //break; ����
			case 7:
				System.out.println("C"); break;
			default:
			System.out.println("F"); break;
			}
			
			
			//if(a>=10) {
			//	System.out.println("A"); }
			if(a>=9) {
				System.out.println("A");
			}
			else if(a==8) {
				System.out.println("B");
				System.out.println("C");
			}
			else if(a==7) {
				System.out.println("C");
			}
			else {
				System.out.println("F");
			}
				
	}

}

