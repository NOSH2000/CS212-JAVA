
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("noon"));
        System.out.println(isPalindrome("Madam I'm Adam"));
        System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
        System.out.println(isPalindrome("A Toyota"));
        System.out.println(isPalindrome("Not a palindrome"));
        System.out.println(isPalindrome("asdfghfdsa")); // not a palindrome
    }

    public static boolean isPalindrome(String in) {
        if (in == null) {
            return false;
        }
        return isPalindromeHelper(in.toUpperCase());
    }

    /**
     * recursive method to check if a given string is paindrome or not
     * @param in
     * @return
     */
    private static boolean isPalindromeHelper(String in) {
        // base case -- empty string or a string with a single character
        if (in.length() == 0 || in.length() == 1)
            return true;
        // recursive steps
        if (!Character.isLetter(in.charAt(0)))
            return isPalindromeHelper(in.substring(1));
        else if (!Character.isLetter(in.charAt(in.length() - 1)))
            return isPalindromeHelper(in.substring(0, in.length() - 1)); // Exclude last char
        // Both first and last char are letters
        else { 
            if (in.charAt(0) == in.charAt(in.length() - 1))
                return isPalindromeHelper(in.substring(1, in.length() - 1));
            else
                return false;
        }
    }
}
