
class PasswordChecker extends Exception {
    int passwordInvalid = 0;

    public PasswordChecker(int conditionViolated) {
        super("Invalid Password: ");
        passwordInvalid = conditionViolated;
    }

    public String printMessage() {
        switch (passwordInvalid) {

            // password should exist
            case 1:
                return ("password should exist");

            // Password should be at least 8 characters.
            case 2:
                return ("password should be longer than than 8 characters.");

            // Password should have at least one lowercase letter
            case 3:
                return ("password should have at least one lowercase letter.");

            // Password should have at least one uppercase letter.
            case 4:
                return ("password should have at least one uppercase letter.");

            // Password should at least have one digit.
            case 5:
                return ("password should at least have one digit.");

            // Password should have at least one special character.
            case 6:
                return ("password should have at least one special character.");

        }
        return ("");
    }


// The function to check the validity of the password.

    public static void passwordIsValid(String password) throws PasswordChecker {

// Check password does not exceed 8 characters.
        if (!((password.length() >= 7) && (password.length() <= 8))) {
            throw new PasswordChecker(1);
        }

        if (true) {
            int count = 0;

// Check 0 to 9 digits.
            for (int i = 0; i <= 9; i++) {

// Converting integer to string.
                String str1 = Integer.toString(i);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new PasswordChecker(2);
            }
        }

// Check special characters.
        if (!(password.contains("@") || password.contains("#") || password.contains("!")
                || password.contains("~") || password.contains("$") || password.contains("%")
                ||password.contains("*")|| password.contains("^") || password.contains("&")))
        {
            throw new PasswordChecker(3);
        }

        if (true) {
            int count = 0;

// Check for capital letters.
            for (int i = 65; i <= 90; i++) {

// Data type casting.
                char c = (char) i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new PasswordChecker(4);
            }
        }

        if (true) {
            int count = 0;

// Check for small letters.

            for (int i = 90; i <= 122; i++) {

// Data type casting.
                char c = (char) i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new PasswordChecker(5);
            }
        }

    }

    // THE MAIN METHOD.
    public static void main(String[] args) {
        String password_1 = "Mongi@99";
        try {
            System.out.println("Is your Password " + password_1 + " valid?");
            passwordIsValid(password_1);
            System.out.println("Thank your password is valid");
        } catch (PasswordChecker e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }

        String password2 = "Mongi@99$$Mpupumiso";
        try {
            System.out.println("Is Password "+ password2 + " valid?");
            passwordIsValid(password2);
            System.out.println("Valid Password");
        } catch (PasswordChecker e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }
    }
}