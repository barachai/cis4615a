/******************************************************************************
 *  Compilation:  javac R05_Met01_J.java
 *  Execution:    java R05_Met01_J
 *
 *  The dinky Widget has its guts protected as "private", and cannot be accessed except by explicit methods
 *
 ******************************************************************************/

public class R05_Met01_J {

   public static void main(String[] args) {
		System.out.println("Let's mess with the widget!");
		Widget w = new Widget();

		for(int i=0; i<10; i++)
			w.add();
		
		for(int i=0; i<5; i++)
			w.remove();

		System.out.println("We have added 10 and subtracted 5: " + w.getTotal());
		System.out.println("Note that we cannot get the total from within the widget itself, we have to use the method");
	}

	 
}

	 /*
     * Rule 05. Methods (MET)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/OBJ01-J.+Limit+accessibility+of+fields
     * Rule 05-Met01
     */

class Widget {
  private int total = 0; // Declared private
 
  public int getTotal () {
    return total;
  }

  void add() {
    if (total < Integer.MAX_VALUE) {     
      total++;
      // ...
    } else {
      throw new ArithmeticException("Overflow");
    }
  }
 
  void remove() { 
    if (total > 0) {     
      total--;
      // ...
    } else {
      throw new ArithmeticException("Overflow");
    }
  }
 
  // Definitions for add() and remove() remain the same
}
