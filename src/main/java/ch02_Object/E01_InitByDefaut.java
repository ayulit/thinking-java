package ch02_Object;

public class E01_InitByDefaut {

	private int i;
	private char c;
	
    public E01_InitByDefaut() {
    	System.out.println("E01_InitByDefaut [i=" + i + ", c=" + c + "]");
    }
	
	public static void main(String[] args) {
		new E01_InitByDefaut();

	}

}

