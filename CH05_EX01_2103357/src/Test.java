
public class Test {
	public static void main(String[] args) {
		//#1. 배열의 선언
		int[] a1;
		int a2[];
		
		//#2. 1차원 배열 객체 생성방법
		//첫번째 방법
		int[] b1 = new int[3];
		System.out.println(b1[0]); // 0
		System.out.println(b1[1]); // 0
		System.out.println(b1[2]); // 0
		
		b1[0]=2;
		b1[1]=3;
		b1[2]=4;
		System.out.println(b1[0]); //2
		System.out.println(b1[1]); //3
		System.out.println(b1[2]); //4
		
		//두번째 방법
		int[] b2 = new int[] {3,4,5};
		System.out.println(b1[0]); //2
		System.out.println(b1[1]); //3
		System.out.println(b1[2]); //4
		
		//세번째 방법
		int[] b3 = {3,4,5};
		System.out.println(b1[0]); //2
		System.out.println(b1[1]); //3
		System.out.println(b1[2]); //4
		
		
		//선언과 객체 생성 분리
		//첫번째 방법(가능)
		int[] c1 = new int[3];
		int[]c2;
		c2=new int[3];
		//두번째 방법 (가능)
		int[] d1 = new int[3];
		int[] d2;
		d2=new int[] {2,3,4};
		//세번째 방법 (불가능)
		int[] e1 = new int[3];
		int[]e2;
		//e2 = {2,3,4}; //오류발생 (3번째 방법은 분리 불가)
	}

}
