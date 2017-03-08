package ch02_Object;

public class E05_DataOnly {

	private int i;
	private double d;
	private boolean b;
	
	public static void main(String[] args) {
		E05_DataOnly data = new E05_DataOnly();
		
		data.setI(5);
		data.setD(2.5);
		data.setB(true);
		
		System.out.println("E05_DataOnly [i=" + data.getI() + 
				           ", d=" + data.getD() + 
				           ", b=" + data.isB() + "]");
	}

	public void setI(int i) {
		this.i = i;
	}

	public void setD(double d) {
		this.d = d;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public int getI() {
		return i;
	}

	public double getD() {
		return d;
	}

	public boolean isB() {
		return b;
	}

}
