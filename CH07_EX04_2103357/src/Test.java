import java.util.Arrays;

//�����ڷ��� �� �ѱ�� (call by address

public class Test {
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3};
		abc(array);
		
	}
	static void abc(int[] array) {
		array[0]=4;
		array[1]=5;
		array[2]=6;
		System.out.println(Arrays.toString(array));
	}

}
