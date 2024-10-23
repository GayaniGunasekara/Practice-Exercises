public class MethodExercise {


        // Method to check if the password is valid
        public static boolean isValidPassword(String password) {
            // Check if the password has at least eight characters
            if (password.length() < 8) {
                return false;
            }

            int digitCount = 0;

            // Loop through the characters of the password
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                // Check if each character is either a letter or a digit
                if (!Character.isLetterOrDigit(ch)) {
                    return false;
                }

                // Count the number of digits
                if (Character.isDigit(ch)) {
                    digitCount++;
                }
            }

            // Check if the password contains at least two digits
            return digitCount >= 2;
        }

        public static void main(String[] args) {
                // Test the password validation
                String inputPassword = "abcd1234";

                if (isValidPassword(inputPassword)) {
                    System.out.println("Password is valid");
                } else {
                    System.out.println("Password is not valid");
                }
            }
        }


