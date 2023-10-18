
public class Test {
	public static void main(String[] args) {
		//Èü¸Þ¸ð¸® °­Á¦ÃÊ±âÈ­ °ª
		
		boolean[] a = new boolean[2];
		byte[] b = new byte[2];
		short[] c = new short[2];
		int[] d = new int[2];
		long[] e = new long[2];
		float[] f = new float[2];
		double[] g = new double[2];
		char[] h = new char[2];
		
		String[] i = new String[2];
		
		System.out.println(a[0]+" " +a[1]); //false false
		System.out.println(b[0]+" " +b[1]); //0 0
		System.out.println(c[0]+" " +c[1]); //0 0
		System.out.println(d[0]+" " +d[1]); //0 0
		System.out.println(e[0]+" " +e[1]); //0 0
		System.out.println(f[0]+" " +f[1]); //0.0 0.0
		System.out.println(g[0]+" " +g[1]); //0.0 0.0
		System.out.println(h[0]+" " +h[1]); //ºóÄ­ Ãâ·Â
		System.out.println(i[0]+" " +i[1]); //null null
	}

}
