package bcd.cde;

import abc.bcd.A;

public class D extends A{
	void def() {
		A a = new A ();
		System.out.println(a); //public 접근 지정자 멤버만 사용 가능
		System.out.println(b); //protected + 자식 클래스 이기 때문에 사용가능
//		System.out.println(c);
//		System.out.println(d);
	}

}
 