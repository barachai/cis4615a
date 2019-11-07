/******************************************************************************
 *  Compilation:  javac R00_Met03_J.java
 *  Execution:    java R00_Met03_J
 *
 *  Shows result of sanitizeUser with legal and illegal values
 *
 ******************************************************************************/

import java.util.regex.Pattern;

public class R00_Met03_J {

   public static void main(String[] args) {
		
		String badUsername ="L!o@r#d Q$u%e^s&t*u(l)a?r";
		System.out.println("We will check" + badUsername);
		String fixedUsername = sanitizeUser(badUsername);
		System.out.println("It can be logged safely (but not usefully) as: " + fixedUsername);
		String goodUsername = "LordQuestular";
		String checkedUsername = sanitizeUser(goodUsername);
		System.out.println("It passed the test and can be logged as is: " + goodUsername);
		
	}

	 /*
     * Rule 00. Methods (MET)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
     * Rule 00-Met03
     */

		public static String sanitizeUser(String username) {
			return Pattern.matches("[A−Za−z0−9 ]+", username) ? username : "unauthorized user ";
		}
}
