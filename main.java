// Practicum 12 (Yes/No Program)
// (TO WRITE)

// This program should prompt the user to enter "yes" or
// "no" and output their response. The user should be allowed to
// enter their response with either upper or lower case characters
// (e.g., "yes", "Yes", "YES").

// REQUIRED OUTPUT:
// The program MUST display the results exactly as shown below:
// "User entered yes"
// "User entered no"
//
// (TO COMPLETE)
import java.util.*;
public class main {
    /**
     * @param args
     */
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter 'Yes' or 'No':");
      String ans = input.next();

      if (ans = String.equalsIgnoreCase('YES') ) {
        System.out.println("User entered YES");
      }
      else if (ans = String.equalsIgnoreCase('NO') ) {
        System.out.println("User entered No");
        
      }else{
        System.out.println("Invalid reply");
      }

    }

}
