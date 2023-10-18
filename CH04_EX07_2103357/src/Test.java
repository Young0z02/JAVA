
public class Test {
	public static void main(String[] args) {
		//break #1;
		for(int i=0; i<10; i++) {
			if(i==3)
				break;
			System.out.println(i); //0,1,2
		}
		
		//break #2;
				for(int i=0; i<10; i++) {
					System.out.println(i);
					if(i==3) {
						break; //0,1,2,3
				}
	}
	
	//break #3
	for(int i=0; i<5; i++) {
		for(int j=0; j<7; j++) {
			if(j==5) {
				break;
			}
				System.out.println("A"); //25¹ø
		}
	}
	
	//break #4
	for(int i=0; i<5; i++) {
		for(int j=0; j<7; j++) {
			if(j==2)
				break;
				System.out.println("A"); //28¹ø
		}
	}
	
	
	//break #5
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				if(j==2 && j==3) {
					break;
				}
					System.out.println("A"); //31
			}
		}
		
		//break #6
				for(int i=0; i<5; i++) {
					for(int j=0; j<7; j++) {
						if(j==2 || j==3) {
							break;
						}
							System.out.println("A"); //3+3+0+3+3 = 12
					}
				}
				
				//break #7
				for(int i=0; i<5; i++) {
					for(int j=0; j<7; j++) {
						if(j==3) {
							i=100;
							break;
						}
							System.out.println("A"); //3
					}
				}
				
				//break #8
				abc: 
				for(int i=0; i<5; i++) {
					for(int j=0; j<7; j++) {
						if(j==3) {
							i=100;
							break abc;
						}
							System.out.println("A"); //3
					}
				
	}
}
}