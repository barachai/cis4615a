/******************************************************************************
 *  Compilation:  javac R03_Met03_J.java
 *  Execution:    java R03_Met03_J
 *
 *  Cleans up an inputed integer
 *
 ******************************************************************************/

import java.io.DataInputStream;
import java.io.IOException;

public class R03_Met03_J {

   public static void main(String[] args) {
		;
	}

	/*
     * Rule 03. Methods (MET)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data
     * Rule 03-Met03
     */

	public static long getInteger(DataInputStream is) throws IOException {
  		return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
	}
}
