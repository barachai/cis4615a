/******************************************************************************
 *  Compilation:  javac R07_Met01_J.java
 *  Execution:    java R07_Met01_J
 *
 *  We don't print out anything from args[] in the exception handling
 *
 ******************************************************************************/

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;

public class R07_Met01_J {

		/*
		 * Rule 07. Methods (MET)
		 * Corrected code per:
		 * https://wiki.sei.cmu.edu/confluence/display/java/ERR01-J.+Do+not+allow+exceptions+to+expose+sensitive+information
		 * Rule 07-Met01
		 */
	public static void main(String[] args) {
 
    File file = null;
    try {
      file = new File(System.getenv("APPDATA") +
             args[0]).getCanonicalFile();
      if (!file.getPath().startsWith("c:\\homepath")) {
        System.out.println("Invalid file");
        return;
      }
    } catch (IOException x) {
      System.out.println("Invalid file");
      return;
    }
 
    try {
      FileInputStream fis = new FileInputStream(file);
    } catch (FileNotFoundException x) {
      System.out.println("Invalid file");
      return;
    }
  }	
}
