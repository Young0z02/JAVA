
public class Test {
	public static void main(String[] args) {
		//main �޼��� �Ű�����
		System.out.println(args.length); //0
		System.out.println(args[0]); //abc
		System.out.println(args[1]); //bcd
		System.out.println(args[2]); //3
		System.out.println(args[3]); //5.8
		
		System.out.println(args[0]+1); // abc1
		System.out.println(args[1]+1); // bcd1
		System.out.println(args[2]+1); // 31 --> string������ ����
		System.out.println(args[3]+1); // 5.81
		
		System.out.println(Integer.parseInt(args[2]+1)); //4
		System.out.println(Double.parseDouble(args[3]+1)); //6.8
	}

}
