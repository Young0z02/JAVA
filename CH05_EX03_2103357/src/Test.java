import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//�迭�� ���
		//#1. �迭 �������� .length (�迭�� ����)
		int[] a=new int[] {2,3,4,5,6,7,8,9};
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[1]); //2,3,4,5,6
		}
		
		//...
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[1]); //2,3,4,5,6,7,8,9
		}
		
		//#3. �������� �迭 ��� ���
		//3-1. for���� �̿��� ���
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]+" "); //2,3,4,5,6,7,8,9
		}
		System.out.println();
		
		//#3-2. for-each���� �̿��� ���
		for (int k:a) {
			System.out.println(k+" "); // 2,3,4,5,6,7,8,9
		}
		System.out.println();
		
		//#3-3. Arrays Ŭ������ ����(static) �޼��� �����
		System.out.println(Arrays.toString(a));
	}

}
