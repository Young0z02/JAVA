class A implements AutoCloseable{
	String resource;
	A(String resource) {
		this.resource=resource;
	}
	void abc() throws Exception {
		
	}
	@Override
	public void close () throws Exception {
		System.out.println("���ҽ� ����");
	}
}


public class Test {
	public static void main(String[] args) {
		//���ҽ� �ڵ����� ����
		
		A a = new A ("���ҽ�");
		try {
			a.abc();
		} catch (Exception e) {
			
		}
		finally {
			try {
			a.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		//�ڵ����ҽ����� try - catch
		try(A A2 = new A ("���ҽ�");) {
			
		}catch (Exception e) {
			
		}
		
	}

	}
