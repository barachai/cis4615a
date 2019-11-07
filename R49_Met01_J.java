/******************************************************************************
 *  Compilation:  javac R49_Met01_J.java
 *  Execution:    java R49_Met01_J
 *
 *  This has an infinite loop that cannot be optimized away.
 *
 ******************************************************************************/

		/*
		 * Rule 49. Methods (MET)
		 * Corrected code per:
		 * https://wiki.sei.cmu.edu/confluence/display/java/MSC01-J.+Do+not+use+an+empty+infinite+loop
		 * Rule 49-Met01
		 */

import java.lang.InterruptedException;


public class R49_Met01_J {
	public final static int DURATION = 1000;

	public static void main(String[] args) {
		System.out.println("control-c out of this; it is literally an infinite loop of waiting on purpos (which is the point)\nThe reason for this is to prevent an optimizer from making the loop go away");

		try { nop();
		} catch (InterruptedException x) {
			System.out.println("Oopsie");
		}
	}	

	private static void nop() throws InterruptedException {
		while(true) {
			Thread.sleep(DURATION);
		}
	}
}


