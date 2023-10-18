
public class Test {
	public static void main(String[] ar) {
		//switch #1 --> if문으로 변환
			int a = 2;
			switch (a) {
			case 10: //System.out.println("A"); break; 생략해도 똑같음
			case 9:
				System.out.println("A"); break;
			case 8:
				System.out.println("B"); //break; 삭제
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

