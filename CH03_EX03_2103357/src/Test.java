
public class Test {
	public static void main(String[] args) {
		//#1. if type #1
		int a=3;
		if(3>5) {
		System.out.println("출력");
		}
		//#2. if type #2
		if (a>3) {
			System.out.println("출력1");
		}
		else {
			System.out.println("출력2");
		}
		//#3. if type #3
		int s=85;
		if(s>90) {
			System.out.println("A");
		}
		else if (s>=80) {
			System.out.println("B");
		}
		else if (s>=70) {
			System.out.println("C");
	}
		else {
			System.out.println("F");
		}
		
		//#3-1. if type #3
				s=85;
				if(s>70) {
					System.out.println("A");
				}
				else if (s>=80) {
					System.out.println("B");
				}
				else if (s>=70) {
					System.out.println("C");
			}
				else {
					System.out.println("F");
				}
				
				//#3-2. if type #3
				s=85;
				if(s>70 && s<80) {
					System.out.println("C");
				}
				else if (s>=80 && s<90) {
					System.out.println("B");
				}
				else if (s>=70) {
					System.out.println("A");
			}
				else {
					System.out.println("F");
				}
				
				//if문 2개 VS. if-else if
				int b=6;
				if(b%2==0) {
					System.out.println("짝수");
				}
				if(b%3==0) {
					System.out.println("3의배수");
				}
				if(b%2==0) {
					System.out.println("짝수");
				}
				else if(b%3==0) {
					System.out.println("3의배수");
				}
		}
}
