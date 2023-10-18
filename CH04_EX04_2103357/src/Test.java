
public class Test {
	public static void main(String[] args) {
		//for
		int i;
		for(i=0; i<10; i++) {
			System.out.println(i);
		}
		System.out.println(i);
		
		for(int a=0; a<20; a++) { //i일 경우 오류가 난다. 그 이유는 위의 for식과 동일한 i이기 때문에 / 같은 동일한 이름은 오류
			System.out.println(a);
		}
//		System.out.println(a);

	for(int a=0; a<100; a+=2) { 
		System.out.println(a);
	}
	
	
	//무한루프
	for(int a=0; ;a++) {
		System.out.println(a);
		if(a<-8) {
			break;
		}
	}
	System.out.println("안녕");
	
//	for(;false;) {
//		System.out.println("안녕");		
//		}
	
	//이중 for문
	for(int a=0; a<10; a++) {
		for(int b=0; b<5; b++ ) {
			System.out.println("A");
		}
	}
	
	

	}
}