
public class Test {
	public static void main(String[] args) {
		//2瞒盔 沥规青纺 (4啊瘤 规过)
		//	1 2
		//	3
		//	4 5 6
		//规过 #1. =================
		int [][] a1 = new int [3][];
		a1[0] = new int[] {1,2}; 
		a1[0] = new int[] {3}; 
		a1[0] = new int[] {4,5,6}; 
		System.out.println(a1[0][0]);
		System.out.println(a1[0][1]);
		System.out.println(a1[1][0]);
		System.out.println(a1[1][1]);
		System.out.println(a1[2][1]);
		System.out.println(a1[2][2]);
		
		//规过 #2. =================
		int[][] a2 = new int[][] {{1,2},{3},{4,5,6}};
		System.out.println(a2[0][0]);
		System.out.println(a2[0][1]);
		System.out.println(a2[1][0]);
		System.out.println(a2[1][1]);
		System.out.println(a2[2][1]);
		System.out.println(a2[2][2]);
		
		//规过 #3. =================
		int[][] a3 = {{1,2},{3},{4,5,6}};
		System.out.println(a3[0][0]);
		System.out.println(a3[0][1]);
		System.out.println(a3[1][0]);
		System.out.println(a3[1][1]);
		System.out.println(a3[2][1]);
		System.out.println(a3[2][2]);

		//免仿规过 #1.
		for(int i=0; i<a3.length; i++) {
			for(int j=0; j<a3[i].length; i++) {
				System.out.println(a3[i][j]);
			}
		}
		
		//免仿规过 #2.
		for (int[] m:a3) {
			for(int k:m) {
				System.out.println(k);
			}
		}
	
}

}
