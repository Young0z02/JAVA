
public class Test {
	public static void main(String[] args) {
		//for
		int i;
		for(i=0; i<10; i++) {
			System.out.println(i);
		}
		System.out.println(i);
		
		for(int a=0; a<20; a++) { //i�� ��� ������ ����. �� ������ ���� for�İ� ������ i�̱� ������ / ���� ������ �̸��� ����
			System.out.println(a);
		}
//		System.out.println(a);

	for(int a=0; a<100; a+=2) { 
		System.out.println(a);
	}
	
	
	//���ѷ���
	for(int a=0; ;a++) {
		System.out.println(a);
		if(a<-8) {
			break;
		}
	}
	System.out.println("�ȳ�");
	
//	for(;false;) {
//		System.out.println("�ȳ�");		
//		}
	
	//���� for��
	for(int a=0; a<10; a++) {
		for(int b=0; b<5; b++ ) {
			System.out.println("A");
		}
	}
	
	

	}
}