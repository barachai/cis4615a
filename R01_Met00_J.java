/******************************************************************************
 *  Compilation:  javac R01_Met00_J.java
 *  Execution:    java R01_Met00_J
 *
 *  The order of initialization matters here
 *
 ******************************************************************************/

	/*
     * Rule 01. Methods (MET)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/DCL00-J.+Prevent+class+initialization+cycles
     * Rule 01-Met00
     */

public class R01_Met00_J {
  private final int balance;
  private static final int deposit = (int) (Math.random() * 100); // Random deposit
  private static final R01_Met00_J c = new R01_Met00_J();  // Inserted after initialization of required fields
  public R01_Met00_J() {
    balance = deposit - 10; // Subtract processing fee
  }
 
  public static void main(String[] args) {
    System.out.println("The account balance is: " + c.balance);
  }
}
