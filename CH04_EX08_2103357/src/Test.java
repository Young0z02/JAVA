
public class Test {
	public static void main(String[] args) {
	//continue #1;
			for(int i=0; i<10; i++) {
				if(i==3)
					continue;
				System.out.println(i); // 0,1,2,4,5,6,7,8,9 /
			}
			
			//continue #2;
					for(int i=0; i<10; i++) {
						System.out.println(i);
						if(i==3) {
							continue; // 0,1,2,3,4,5,6,7,8,9 / 
					}
		}
		
		//continue #3
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				if(j==5) { // 0,1,2,3,4,6
					continue;
				}
					System.out.println("A"); // 6+6+6+6+6 = 30
			}
		}
		
		//continue #4
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				if(j==2)
					continue;
					System.out.println("A"); // 7+7+0+7+7 =28번
			}
		}
		
		
		//continue #5
			for(int i=0; i<5; i++) {
				for(int j=0; j<7; j++) {
					if(j==2 && j==3) {
						continue;
					}
						System.out.println("A"); // 7+7+6+7+7 = 34번 - 2와 3일 때 경우의 수만 빼기
				}
			}
			
			//continue #6
					for(int i=0; i<5; i++) {
						for(int j=0; j<7; j++) {
							if(j==2 || j==3) {
								continue;
							}
								System.out.println("A"); // 6+6+0+6+6 = 24번
						}
					}
					
					//break #7
					for(int i=0; i<5; i++) {
						for(int j=0; j<7; j++) {
							if(j==3) {
								i=100;
								continue;
							}
								System.out.println("A"); // 6 = 6번 / 101로 넘어감
						}
				}
				
				//continue #8
				abc: 
				for(int i=0; i<5; i++) {
					for(int j=0; j<7; j++) {
						if(j==3) {
							i=100;
							continue abc;
						}
							System.out.println("A"); // 3+3+3+3+3+3 = 15번
							}
				}
						
			//misson
			for(int i=0; ; i++) {
				if(i==9) {
					break;
				}
				if(i%2==1) {
					continue;
				}
				System.out.println(i);
			} //0,2,4,6,8 break / continue / if
			
			
		}
	
	}
