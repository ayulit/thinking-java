package ch02_Object;

public class E07_Incrementable {

	public static void main(String[] args) {
		
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		
		st1.print(); // 47
		st2.print(); // 47
		
		System.out.println(st1.i); // 47
		System.out.println(st2.i); // 47
		
		StaticTest.i++;
		System.out.println(StaticTest.i); // 48
		
		E07_Incrementable sf = new E07_Incrementable();
		
		// calling static method from object (it's a non-static way!)
		sf.increment();
		System.out.println(StaticTest.i); // 49
		
		// calling static method from class
		E07_Incrementable.increment();
		System.out.println(StaticTest.i); // 50

		
		increment();
		System.out.println(StaticTest.i); // 51
		
	}
	
	// static method
	public static void increment() {
		StaticTest.i++;
	}
	
}

class StaticTest {
	
	// static field!
	public static int i = 47;
	
	public void print() {
		System.out.println(i);
	}
}