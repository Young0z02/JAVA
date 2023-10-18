
public class Test {
	public static void main(String[] args) {
		//while #1
		int a=0;
		while(a<10) {
			System.out.println(a);
			a++;
		}
		
		//while #2
		int b=20;
		while(b>0) {
			System.out.println(b);
			b--;
		}
		
		//while #1--> for
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		//while #2--> for
		for(int i=20; i>0; i--) {
			System.out.println(i);
		}
		
		//while #3
		int c=10;
		while(c<0) { //c<0 일 때는 실행이 되지 않는다.
			System.out.println(c);
			c--;
		}
		
		//while #4
		int d=0;
		while(d<10) {
			d++;
			System.out.println(d); //결과 : 1~10까지 찍힌다.
		}
		
		//while #4 --> for
		for(int i=1; i<11; i++) {
			System.out.println(i);
		}
		
		
		
	}

}
