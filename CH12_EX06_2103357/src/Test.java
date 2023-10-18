interface A {
	static void abc() {
		System.out.println("인터페이스 내의 static 메서스");
	}
}
public class Test {
	public static void main(String[  ] args) {
		A.abc();
	}

}
