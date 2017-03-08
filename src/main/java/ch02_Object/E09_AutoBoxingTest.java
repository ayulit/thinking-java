package ch02_Object;

public class E09_AutoBoxingTest {

	public static void main(String[] args) {
		
		Byte by = 1;
		byte bt = by; // 1 byte
		System.out.println("byte=" + bt);
		
		Short sh = 2;
		short st = sh; // 2 bytes
		System.out.println("short=" + st);
		
		Integer in = 4;
		int i = in; // 4 bytes
		System.out.println("int=" + i);

		Long lo = 8L;
		long l = lo; // 8 bytes
		System.out.println("long=" + l);

		Boolean bo = true;
		boolean b = bo; // 1 byte
		System.out.println("boolean=" + b);

		Character ch = 'x';
		char c = ch; // 2 bytes, because UTF-8!
		System.out.println("char=" + c);
		
		Float fl = 4.0F;
		float f = fl; // 4 bytes
		System.out.println("float=" + f);

		Double db = 8.0D;
		double d = db; // 8 bytes
		System.out.println("double=" + d);
		
	}

}
