package newproj;

/**
 * Run the project
 */
public class Main {

	/**
	 * main method.  
	 * @param args.  Expects one argument; the filepath of the input file.  
	 */
	public static void main(String[] args) {
		new Main().run(args); 
	}
	
	
	/**
	 * Runs 
	 * @param args
	 */
	public void run(String[] args) {
		
		
		try {			
		
			System.out.println("running with args=" + args);
			
			
		}catch(Throwable t) {
			System.err.println("Unexpected runtime error.");
			t.printStackTrace(System.err);
		}
	}
	
	

}
