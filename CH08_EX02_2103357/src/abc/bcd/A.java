package abc.bcd;

public class A {
	public int a=1;
	protected int b=2;
	int c=3; //default 접근 지정자
	private int d=4;
	
	public void print() {
		System.out.println(a); //a 사용가능
		System.out.println(b); //b 사용가능
		System.out.println(c); //c 사용가능
		System.out.println(d); //d 사용가능
	}
}
