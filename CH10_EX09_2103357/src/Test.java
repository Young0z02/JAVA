//String 클래스의 equals는 이미 내용 비교로 오버라이딩이 되어져 있다.

public class Test {
	public static void main(String[] args) {
	String a = new String ("안녕");
	String b = new String ("안녕");

	System.out.println(a==b);
	System.out.println(a.equals(b));

	}
}