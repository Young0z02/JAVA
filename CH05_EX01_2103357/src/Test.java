
public class Test {
	public static void main(String[] args) {
		//#1. �迭�� ����
		int[] a1;
		int a2[];
		
		//#2. 1���� �迭 ��ü �������
		//ù��° ���
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
		
		//�ι�° ���
		int[] b2 = new int[] {3,4,5};
		System.out.println(b1[0]); //2
		System.out.println(b1[1]); //3
		System.out.println(b1[2]); //4
		
		//����° ���
		int[] b3 = {3,4,5};
		System.out.println(b1[0]); //2
		System.out.println(b1[1]); //3
		System.out.println(b1[2]); //4
		
		
		//����� ��ü ���� �и�
		//ù��° ���(����)
		int[] c1 = new int[3];
		int[]c2;
		c2=new int[3];
		//�ι�° ��� (����)
		int[] d1 = new int[3];
		int[] d2;
		d2=new int[] {2,3,4};
		//����° ��� (�Ұ���)
		int[] e1 = new int[3];
		int[]e2;
		//e2 = {2,3,4}; //�����߻� (3��° ����� �и� �Ұ�)
	}

}
