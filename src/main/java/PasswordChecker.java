// PASSWORD CHECKER.

class PasswordChecker{

// The function to check the validity of the password.

    public static boolean passwordIsValid(String password) {
        int count = 0;
        boolean isSpecialChar = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;


// Check special characters.
        for (int m = 0; m < password.length(); m++) {
            if (!Character.isLetterOrDigit(password.charAt(m))) {
                isSpecialChar = true;
                break;
            }
        }
        if (isSpecialChar) {
            count++;
        } else
            System.out.println("Password should have special");


// Check for uppercase.


        for (int m = 0; m < password.length(); m++) {
            if (Character.isUpperCase(password.charAt(m))) {
                isUpperCase = true;
                break;
            }
            }
            if (isUpperCase) {
                count++;
            } else
                System.out.println("Password should have uppercase");


// Check for lowercase.


        for (int m = 0; m < password.length(); m++) {
            if (Character.isLowerCase(password.charAt(m))) {
                isLowerCase = false;
                break;
            }
            }
            if (isLowerCase) {
                count++;
            } else
                System.out.println("Password should have lowercase");



// Check for digits.

        boolean isDigit = false;
        for (int m = 0; m < password.length(); m++) {
            if (Character.isDigit(password.charAt(m))) {
                isDigit = false;
                break;
            }
            }
            if (isDigit) {
                count++;
            } else
                System.out.println("Password should have a digit");


// Check the length of password.

            if (password.length() <= 8) {
                count++;

            }
            else {
                System.out.println("Password should not be more than 8 characters");

        }

        if(count >= 3)
        {
            return true;

        }
            return false;
    }


   // THE MAIN METHOD.

        public static void main (String[]args){

        System.out.println( passwordIsValid(""));
        }

    }

