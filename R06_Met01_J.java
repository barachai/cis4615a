/******************************************************************************
 *  Compilation:  javac R06_Met01_J.java
 *  Execution:    java R06_Met01_J
 *
 *  What's important here is that getAbsAdd doesn't assert stuff
 *
 ******************************************************************************/

public class R06_Met01_J {

   public static void main(String[] args) {
		int a = -10;
		int b = 10;
		int badMojo = Integer.MIN_VALUE;
		System.out.println("We are playing with integers a=" + a + ", b=" + b + " and badMojo=" + badMojo);
		int x = getAbsAdd(a, b);
		System.out.println("a + b = " + x);
		System.out.println("If we pump in badMojo:\na + badMojo = ");
		int q = getAbsAdd(a, badMojo);
		System.out.println("a + badMojo = " + q);
	}

	/*
     * Rule 06. Methods (MET)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/MET01-J.+Never+use+assertions+to+validate+method+arguments
     * Rule 06-Met01
     */

	public static int getAbsAdd(int x, int y) {
  		if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
    		throw new IllegalArgumentException();
  		}
  		int absX = Math.abs(x);
  		int absY = Math.abs(y);
  		if (absX > Integer.MAX_VALUE - absY) {
      	throw new IllegalArgumentException();
  		}
  		return absX + absY;
	}
}
