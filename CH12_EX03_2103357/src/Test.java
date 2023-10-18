//#interface

interface A {
	int m=3; //public static final
	void abc(); //public abstract - 오류가 안남 : abstract 키워드가 붙었다는 소리
}

class B implements A {

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Test {
	public static void main(String[] args) {
		System.out.println(A.m); //static ㅣ워드가 붙었다는 소리
		// A.m=5; //오류 : final 키워드가 붙었다는 소리
	}

}
