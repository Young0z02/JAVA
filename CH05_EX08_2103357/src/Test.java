
public class Test {
	public static void main(String[] args) {
		//#String Ŭ������ �޼���
		String str1 = "abcdabc";
		String str2= "�����ٶ󰡳���";
		System.out.println(str1.length()); // �޼��� ǥ�� 7
		System.out.println(str2.length()); // �޼��� ǥ�� 7
		
		System.out.println(str1.indexOf('b')); //1
		System.out.println(str1.indexOf("b")); //1
		System.out.println(str1.indexOf("b",3)); //5
		System.out.println(str1.lastIndexOf('b')); //5
		System.out.println(str1.lastIndexOf('b',4)); //5
		
		String str3 = "abcdef(abcd)agdgewajava";
		System.out.println(str3.substring(2)); //cdefgabcd
		System.out.println(str3.substring(2,5)); //cde
		
		//�̼�#1 �Ұ�ȣ ���� ���� �̾Ƴ���
		String str4 = "abcdef(abcd)agdgewajava";
		int startIndex=str4.indexOf('(')+1;
		int endIndex=str4.indexOf(')');
		System.out.println(str4.substring(startIndex,endIndex));
		
		String str5 = "abc/bcd/cde/def";
		System.out.println(str5.replace("/", ","));
		
		String[] strArray = str5.split("/|-");
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		String str6 = new String ("�ȳ�");
		String str7 = new String ("�ȳ�");
		System.out.println(str6==str7);
		System.out.println(str6.equals(str7));
		
		//�̼� #2. �����̸����� Ȯ��� �����ϰ� �����̸��� ����ϱ�
		String fileName = "abc-de.ge.bmp";
	
		//�̼� #3. 5�� �������� ������ ���� Ǯ�� p.206������ 8�� ����
		
		
		
	}

}
