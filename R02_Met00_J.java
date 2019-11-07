/******************************************************************************
 *  Compilation:  javac R02_Met00_J.java
 *  Execution:    java R02_Met00_J
 *
 *  Does something with the result of original.replace()
 *
 ******************************************************************************/

public class R02_Met00_J {

	 /*
     * Rule 02. Methods (MET)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
     * Rule 02-Met00
     */

   public static void main(String[] args) {
		String original = "password";
		System.out.println("The original string: " + original);
    	original = original.replace('s', '$');
    	System.out.println("Now it is more secure: " + original);
	}
}
