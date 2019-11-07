/******************************************************************************
 *  Compilation:  javac R06_Met01_J.java
 *  Execution:    java R06_Met01_J
 *
 *  Calls function getAbsAdd(x,y) with legal and illegal values
 *
 ******************************************************************************/

public class R06_Met01_J {

    public static void main(String[] args) {
	
       int a = 17;
       System.out.println("a = " + a);
       int b = 42;
       System.out.println("b = " + b);
       int c = getAbsAdd(a, b);
       System.out.println("c = " + c);

       a = Integer.MIN_VALUE; //used for testing secure version
       System.out.println("a = " + a);
       b = Integer.MAX_VALUE;
       System.out.println("b = " + b);
       c = getAbsAdd(a, b);
       System.out.println("c = " + c);
      
    }

    /*
     * Rule 06. Methods (MET)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/MET01-J.+Never+use+assertions+to+validate+method+arguments
     *
     *Rule 06-Met01
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

