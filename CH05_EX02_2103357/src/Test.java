
public class Test {
	public static void main(String[] args) {
		//기본자료형 vs 참조자료형
		//기본자료형
		int a=3;
		int b=a;
		b=7;
		System.out.println(a); //3
		System.out.println(b); //7
		
		//참조자료형
		int[] c= {2,3,4};
		int[] d=c;
		d[0]=7;
		System.out.println(c[0]);
		System.out.println(d[0]);
	}

}
