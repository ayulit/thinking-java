package ch02_Object;

public class E08_StaticTest {
	
	static int i = 47;

	public static void main(String[] args) {
		
		E08_StaticTest st1 = new E08_StaticTest();
		E08_StaticTest st2 = new E08_StaticTest();
		
		System.out.println(st1.i + " == " + st2.i); // 47 == 47

		st1.i ++; // increment
		
		System.out.println(st1.i + " == " + st2.i); // 48 == 48

	}

}
