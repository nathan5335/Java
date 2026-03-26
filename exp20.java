public class exp20 {
    public static void main(String[] args) {
        UserAuthentication authenticator = new UserAuthentication("gautham", "Pass123");

        System.out.println("");
        System.out.println("   User Authentication System - Test Cases");
        System.out.println("");
        System.out.println();

        System.out.println("Test Case 1: Valid Credentials");
        System.out.println("Username: gautham, Password: Pass123");
        testLogin(authenticator, "gautham", "Pass123");
        System.out.println();

        System.out.println("Test Case 2: Invalid Username");
        System.out.println("Username: admin, Password: Pass123");
        testLogin(authenticator, "admin", "Pass123");
        System.out.println();

        System.out.println("Test Case 3: Invalid Password");
        System.out.println("Username: gautham, Password: wrongpass");
        testLogin(authenticator, "gautham", "wrongpass");
        System.out.println();

        System.out.println("Test Case 4: Empty Username");
        System.out.println("Username: (empty), Password: Pass123");
        testLogin(authenticator, "", "Pass123");
        System.out.println();

        System.out.println("Test Case 5: Empty Password");
        System.out.println("Username: gautham, Password: (empty)");
        testLogin(authenticator, "gautham", "");
        System.out.println();

        System.out.println("Test Case 6: Both Empty");
        System.out.println("Username: (empty), Password: (empty)");
        testLogin(authenticator, "", "");
        System.out.println();

        System.out.println("Test Case 7: Null Username");
        System.out.println("Username: null, Password: Pass123");
        testLogin(authenticator, null, "Pass123");
        System.out.println();

        System.out.println("");
        System.out.println("   Password Strength Test");
        System.out.println("");
        testPasswordStrength("Pass123");
        testPasswordStrength("weak");
        testPasswordStrength("NoDigits");
        testPasswordStrength("noupppercase1");
        System.out.println();
    }

    public static void testLogin(UserAuthentication authenticator, String username, String password) {
        try {
            authenticator.authenticate(username, password);
        } catch (InvalidCredentialsException e) {
            System.out.println("✗ " + e.toString());
        }
    }

    public static void testPasswordStrength(String password) {
        boolean isStrong = UserAuthentication.isStrongPassword(password);
        System.out.println("Password: " + password + " -> Strength: " + 
                         (isStrong ? "STRONG" : "WEAK"));
    }
}


/*PS C:\Users\MCA\Desktop\gautham> javac exp20.java
PS C:\Users\MCA\Desktop\gautham> java exp20      
===============================================
   User Authentication System - Test Cases
===============================================

Test Case 1: Valid Credentials
Username: gautham, Password: Pass123
? Authentication successful for user: gautham

Test Case 2: Invalid Username
Username: admin, Password: Pass123
? Invalid Username: Invalid username: admin

Test Case 3: Invalid Password
Username: gautham, Password: wrongpass
? Invalid Password: Invalid password provided!

Test Case 4: Empty Username
Username: (empty), Password: Pass123
? Empty Username: Username cannot be empty!

Test Case 5: Empty Password
Username: gautham, Password: (empty)
? Empty Password: Password cannot be empty!

Test Case 6: Both Empty
Username: (empty), Password: (empty)
? Empty Username: Username cannot be empty!

Test Case 7: Null Username
Username: null, Password: Pass123
? Empty Username: Username cannot be empty!

===============================================
   Password Strength Test
===============================================
Password: Pass123 -> Strength: STRONG
Password: weak -> Strength: WEAK
Password: NoDigits -> Strength: WEAK
Password: noupppercase1 -> Strength: WEAK */