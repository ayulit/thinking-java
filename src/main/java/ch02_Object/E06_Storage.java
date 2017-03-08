package ch02_Object;

public class E06_Storage {

	private String s = "hello";
	
	private int storage(String s) {
		return s.length() * 2;
	}
	
	private void print() {
		System.out.println("Storage(s) = " + storage(s));
	}
	
	public static void main(String[] args) {
		E06_Storage st = new E06_Storage();
		st.print(); // 10
	}

}
