package bcd.cde;

import abc.bcd.A;

public class D extends A{
	void def() {
		A a = new A ();
		System.out.println(a); //public ���� ������ ����� ��� ����
		System.out.println(b); //protected + �ڽ� Ŭ���� �̱� ������ ��밡��
//		System.out.println(c);
//		System.out.println(d);
	}

}
 