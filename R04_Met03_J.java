/******************************************************************************
 *  Compilation:  javac R04_Met03_J.java
 *  Execution:    java R04_Met03_J
 *
 *  Outputs as a string what was made from a BigInteger, correctly.
 *
 ******************************************************************************/

import java.math.BigInteger;

public class R04_Met03_J {

	 /*
     * Rule 04. Methods (MET)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string
     * Rule 04-Met03
     */

   public static void main(String[] args) {
		
		BigInteger x = new BigInteger("530500452766");
		String s = x.toString();  // Valid character data
		System.out.println("This is what we're manipulating: "+s);
		byte[] byteArray = s.getBytes();
		String ns = new String(byteArray); 
		x = new BigInteger(ns);
		System.out.println("It was a BigInteger, but then it was a string, then a byteArray, and now is a BigInteger again!");

	}
}
