
public class Test {
	public static void main(String[] args) {
		
		//2차원 정방행렬 (4가지 방법)
		//	1 2 3
		//	4 5 6
		//방법 #1. =================
		int [][] a1 = new int [2][3];
		System.out.println(a1[0][0]);
		System.out.println(a1[0][1]);
		System.out.println(a1[0][2]);
		System.out.println(a1[1][0]);
		System.out.println(a1[1][1]);
		System.out.println(a1[1][2]);
		a1[0][0]=1;
		a1[0][1]=2;
		a1[0][2]=3;
		a1[1][0]=4;
		a1[1][0]=5;
		a1[1][1]=6;
		System.out.println(a1[0][0]);
		System.out.println(a1[0][1]);
		System.out.println(a1[0][2]);
		System.out.println(a1[1][0]);
		System.out.println(a1[1][1]);
		System.out.println(a1[1][2]);
		
		//방법 #2. =================
		int[][] a2 = new int[2][];
		a2[0]=new int[] {1,2,3}; //1차원 배열
		a2[1]=new int[] {4,5,6}; //1차원 배열
		System.out.println(a2[0][0]);
		System.out.println(a2[0][1]);
		System.out.println(a2[0][2]);
		System.out.println(a2[1][0]);
		System.out.println(a2[1][1]);
		System.out.println(a2[1][2]);
		
		//방법 #3. =================
		int[][] a3 = new int[][] {{1,2,3}, {4,5,6}};
		System.out.println(a3[0][0]);
		System.out.println(a3[0][1]);
		System.out.println(a3[0][2]);
		System.out.println(a3[1][0]);
		System.out.println(a3[1][1]);
		System.out.println(a3[1][2]);
		
		//방법 #4. =================
		int[][] a4 = {{1,2,3}, {4,5,6}};
		System.out.println(a4[0][0]);
		System.out.println(a4[0][1]);
		System.out.println(a4[0][2]);
		System.out.println(a4[1][0]);
		System.out.println(a4[1][1]);
		System.out.println(a4[1][2]);
		
		
	}

}
