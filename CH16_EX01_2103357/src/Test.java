class Apple{}
class Pencil{}

class Goods1{ //Object ��ü�� ����Ͽ� �ΰ��� ��ü�� �����ϴ� Ŭ����
	Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

class Goods2 <T>{ //���׸� Ŭ������ �ΰ��� ��ü�� �����ϴ� Ŭ����
	T obj;
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
public class Test {
	public static void main(String[] args) {
		Goods1 g1 = new Goods1();
		g1.setObj(new Apple());
		Apple apple1 = (Apple)g1.getObj();
		
		Goods1 g2 = new Goods1();
		g2.setObj(new Pencil());
		Pencil pencil = (Pencil)g2.getObj();
		
		Goods1 g3 = new Goods1();
		g3.setObj(new Pencil());
		//��õ��
//		Apple apple2 = (Apple)g3.getObj(); // ��Ÿ�� ����
		
		Goods2<Apple> gg1 = new Goods2<Apple>();
		gg1.setObj(new Apple());
		Apple apple3 = gg1.getObj();
		
		Goods2<Pencil> gg2 = new Goods2<Pencil>();
		gg2.setObj(new Pencil());
		Pencil pencil3 = gg2.getObj();
		  
		Goods2<Pencil> gg3 = new Goods2<Pencil>();
		gg3.setObj(new Pencil());
		//��õ��
//		Apple apple4 = gg3.getObj(); //syntax ����
		
		
	}

}
