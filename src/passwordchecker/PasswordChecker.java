/*Get a String of a single word from the user at the command line and check whether the String, 
called inputPassword, conforms to the following password policy.
 */

/*The password must:
*Be 3 characters in length
*Include at least one uppercase character
*Include at least one digit
*/

/*If the password conforms to the policy, output "The provided password is valid."
*Otherwise, output "The provided password is invalid because it must be three characters in length
and include at least one digit and at least one uppercase character. Please try again."
*A loop is not needed for this program.
*/
package passwordchecker;
import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Password: ");
        
        String password = scan.nextLine();
        
        if(password.length() == 3)
        {
            if((password.charAt(0) >= 'A' && password.charAt(0) <= 'Z')
                    || (password.charAt(1) >= 'A' && password.charAt(1) <= 'Z')
                    || (password.charAt(2) >= 'A' && password.charAt(2) <= 'Z'))
            {
                if((password.charAt(0) >= '0' && password.charAt(0) <= '9')
                        || (password.charAt(1) >= '0' && password.charAt(1) <= '9')
                        || (password.charAt(2) >= '0' && password.charAt(2) <= '9')) 
                {
                    System.out.println("The provided password is valid.");
                }
                else
                    System.out.println("The provided password is invalid because it must be three characters in length and include at least one digit and at least one uppercase character.  Please try again.");
            }
            else
                System.out.println("The provided password is invalid because it must be three characters in length and include at least one digit and at least one uppercase character.  Please try again.");
        }
        else
            System.out.println("The provided password is invalid because it must be three characters in length and include at least one digit and at least one uppercase character.  Please try again.");
    }
}