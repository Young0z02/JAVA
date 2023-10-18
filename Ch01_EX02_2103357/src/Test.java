
public class Test {
	public static void main(String[] ar) {
		//println();
		System.out.println("화면"+"출력");
		System.out.println("화면"+2);
		System.out.println("5,8");
		System.out.println(2+3);
		System.out.println("화면"+3+2);
		System.out.println(3+"화면"+2);
		System.out.println(3+2+"화면");
		System.out.println("이 부분이 오류났습니다."); //한줄 띄우기

		
		//print()
		System.out.print("소프트");
		System.out.print("웨어");
		System.out.print("융합");
		System.out.print("\n");
		System.out.print("한양여대");
		
		System.out.println("안녕하세요"); //동일한 코드
		System.out.print("안녕하세요\n"); //동일한 코드
		
		
		//printf
		System.out.printf("제 이름은 %s입니다", "김동형");
		System.out.printf("안녕하세요");
		System.out.printf("국어:%d, 영어:%d 평균:%f", 70,80,75,0);
		
		System.out.printf("숫자 10은 10진수 %d입니다", 10);
		System.out.printf("숫자 10은 8진수 %0입니다", 10);
		System.out.printf("숫자 10은 16진수 %x입니다", 10);
	}
}
