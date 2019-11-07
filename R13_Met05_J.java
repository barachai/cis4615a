/******************************************************************************
 *  Compilation:  javac R13_Met05_J.java
 *  Execution:    java R13_Met05_J
 *
 *  Make sure to wrap your things in read-only version sometimes!
 *
 ******************************************************************************/

public class R13_Met05_J {
	public static void main(String[] args) {
 		
	}	
}

		/*
		 * Rule 13. Methods (MET)
		 * Corrected code per:
		 * https://wiki.sei.cmu.edu/confluence/display/java/FIO05-J.+Do+not+expose+buffers+created+using+the+wrap%28%29+or+duplicate%28%29+methods+to+untrusted+code
		 * Rule 13-Met05
		 */

final class Wrap {
  private char[] dataArray;
 
  public Wrap() {
    dataArray = new char[10];
    // Initialize
  }
 
  public CharBuffer getBufferCopy() {
    return CharBuffer.wrap(dataArray).asReadOnlyBuffer();
  }
}
