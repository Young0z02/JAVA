import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//배열의 출력
		//#1. 배열 참조변수 .length (배열의 길이)
		int[] a=new int[] {2,3,4,5,6,7,8,9};
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[1]); //2,3,4,5,6
		}
		
		//...
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[1]); //2,3,4,5,6,7,8,9
		}
		
		//#3. 세가지의 배열 출력 방법
		//3-1. for문을 이용한 출력
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]+" "); //2,3,4,5,6,7,8,9
		}
		System.out.println();
		
		//#3-2. for-each문을 이요한 출력
		for (int k:a) {
			System.out.println(k+" "); // 2,3,4,5,6,7,8,9
		}
		System.out.println();
		
		//#3-3. Arrays 클래스의 정적(static) 메서드 사용방법
		System.out.println(Arrays.toString(a));
	}

}
