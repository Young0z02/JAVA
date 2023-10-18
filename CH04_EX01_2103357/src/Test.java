
public class Test {
	public static void main(String [] ar) {
		//switch #1
		int a = 2;
		switch (a) {
		case 10:
			System.out.println("A"); break;
		case 9:
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		default:
		System.out.println("F"); break;
		}
		
		//switch #2
		char b = 'B';
		switch (b) {
		case 'A':
			System.out.println("A"); break;
		case 'B':
			System.out.println("A"); break;
		case 'C':
			System.out.println("B"); break;
		case 'D':
			System.out.println("C"); break;
		default:
			System.out.println("F"); break;
		}
				
		//switch #3
		String c= "¾È³ç";
		switch (c) {
		case "¹æ°¡":
			System.out.println("A"); break;
		case "¾È³ç":
			System.out.println("A"); break;
		case "¶¯Å¥":
			System.out.println("B"); break;
		case "°¨»ç":
			System.out.println("C"); break;
		default:
		System.out.println("F"); break;
		}
		
		
	}

}
