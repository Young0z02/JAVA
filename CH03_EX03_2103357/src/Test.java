
public class Test {
	public static void main(String[] args) {
		//#1. if type #1
		int a=3;
		if(3>5) {
		System.out.println("���");
		}
		//#2. if type #2
		if (a>3) {
			System.out.println("���1");
		}
		else {
			System.out.println("���2");
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
				
				//if�� 2�� VS. if-else if
				int b=6;
				if(b%2==0) {
					System.out.println("¦��");
				}
				if(b%3==0) {
					System.out.println("3�ǹ��");
				}
				if(b%2==0) {
					System.out.println("¦��");
				}
				else if(b%3==0) {
					System.out.println("3�ǹ��");
				}
		}
}
