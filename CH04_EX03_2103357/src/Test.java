
public class Test {
	public static void main(String[] args) {
		//if --> switch
		int a=85;
		if(a>=90) {
			System.out.println("A");
		}
		else if(a>=80) {
			System.out.println("B");
		}
		else if(a>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		
		//swich�� �ٲ㺸��
		switch(a/10) {
		case 10:
		case 9:
			System.out.println("A"); break;
		case 8:
			System.out.println("B"); break;
		case 7:
			System.out.println("C"); break;
		case 6:
			System.out.println("D"); break;
		default:
			System.out.println("F"); break;
		}
		
		//if --> ���׿�����
		int b=3;
		int c;
		if (b<3) {
			c=5;
		}
		else {
			c=10;
		}
		System.out.println(c);

	
	//���׿�����
	c=(b<3)?5:10;
	System.out.println(c);
	
	}
}
