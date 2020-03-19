package passwordHw;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        //scan for password
        Scanner sc = new Scanner(System.in);
        //store password in variable
        final String PASSWORD = "Coronavirus2020";
        // allows attempts to be called later on in code
        int attempts = 1;
        // allows object to be called
        String password;
        //continuously prompts user to put in password unless...
        while (true) {
            System.out.println("What is your password?");
            password = sc.nextLine();
            // password is correct so code ends because of "return;"
            if (password.equals (PASSWORD)) {
                System.out.println("You are logged in!!!");
                return;
                // password is entered over 3x so user is locked out and loop ends because of "return;"
            } else if(attempts > 3) {
                System.out.println("You are locked out!!!");
                return;
                // if password is incorrect user is given 3 tries to enter correct password or user will be locked out
                //attempts are tracked and added up using "++" increment
            }else{
                System.out.println("Incorrect password." + "\n" + "This is your # " + attempts + " attempt" + " until you are locked out!");
                attempts++;
            }

        }
    }
}




