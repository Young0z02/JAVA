class A{
	int id;
	int pw;
	
	A(int id, int pw) {
		this.id=id;
		this.pw=pw;
	}
		
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof A)) {
			return false;
		}
		
		if ((this.id == ((A)obj).id) && (this.pw == ((A)obj).pw))
				return true;
		else
		return false;
	}
}
public class Test {
	public static void main(String[] args) {
		A a1 = new A (2020,1234);
		A a2 = new A (2020,1234);
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		//# 미션
		// 두객체의 id와 pw가 동일한 경우에는 a1.equals(a2)가 true가 나오도록 class A를 수정하라.
		
	}

}
