// most of my projects are in processing, and I couldn't import them properly
// I used this user/password class instead

import java.util.function.DoubleToIntFunction;
import java.util.*;
public class RunMyProgram {


    public static void main(String[] args) {
        Account myaccount = new Account("username", "password");
        System.out.println("Username: " + myaccount.getUsername());
        System.out.println("Password: " + myaccount.getPassword());

        System.out.println("Login Successful: " + myaccount.checkCredentials("username", "password"));
        System.out.println();
        System.out.println("Username Change Successful: " + myaccount.setUsername("new", "password"));
        System.out.println("Password Change Successful: " + myaccount.setPassword("newP", "password"));
        System.out.println();
        System.out.println("Username: " + myaccount.getUsername());
        System.out.println("Password: " + myaccount.getPassword());

        System.out.println("Confirmed Password Change Via Login With New Credentials: " + myaccount.checkCredentials("new", "newP"));

    }


}
