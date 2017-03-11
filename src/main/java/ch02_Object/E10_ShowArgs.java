package ch02_Object;

public class E10_ShowArgs {

	public static void main(String[] args) {

		// we need 3 command line arguments
		if(args.length < 3) {
			System.err.println("Need 3 command line arguments!");
			System.exit(1);
		}
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
	}

}
