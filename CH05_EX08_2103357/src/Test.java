
public class Test {
	public static void main(String[] args) {
		//#String 클래스의 메서드
		String str1 = "abcdabc";
		String str2= "가나다라가나다";
		System.out.println(str1.length()); // 메서드 표시 7
		System.out.println(str2.length()); // 메서드 표시 7
		
		System.out.println(str1.indexOf('b')); //1
		System.out.println(str1.indexOf("b")); //1
		System.out.println(str1.indexOf("b",3)); //5
		System.out.println(str1.lastIndexOf('b')); //5
		System.out.println(str1.lastIndexOf('b',4)); //5
		
		String str3 = "abcdef(abcd)agdgewajava";
		System.out.println(str3.substring(2)); //cdefgabcd
		System.out.println(str3.substring(2,5)); //cde
		
		//미션#1 소괄호 안의 문자 뽑아내기
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
		
		String str6 = new String ("안녕");
		String str7 = new String ("안녕");
		System.out.println(str6==str7);
		System.out.println(str6.equals(str7));
		
		//미션 #2. 파일이름에서 확장명 제외하고 파일이름만 출력하기
		String fileName = "abc-de.ge.bmp";
	
		//미션 #3. 5장 연습문제 마지막 문제 풀기 p.206페이지 8번 문제
		
		
		
	}

}
