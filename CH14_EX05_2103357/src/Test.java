class A implements AutoCloseable{
	String resource;
	A(String resource) {
		this.resource=resource;
	}
	void abc() throws Exception {
		
	}
	@Override
	public void close () throws Exception {
		System.out.println("府家胶 秦力");
	}
}


public class Test {
	public static void main(String[] args) {
		//府家胶 磊悼秦力 抗力
		
		A a = new A ("府家胶");
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
		//磊悼府家胶秦力 try - catch
		try(A A2 = new A ("府家胶");) {
			
		}catch (Exception e) {
			
		}
		
	}

	}
