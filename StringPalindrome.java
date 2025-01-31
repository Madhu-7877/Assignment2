package practice;

public class StringPalindrome {
	
    /**
     * Method to check if a string is a palindrome
     */
    public static boolean isPalindrome(String str) {
        /**
         * Step 1: Reverse the input string using StringBuilder
         */
        String reversed = new StringBuilder(str).reverse().toString();
        
        /**
         * Step 2: Check if the original string is equal to the reversed string
         */
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        /**
         * Test case 1: Check if "madam" is a palindrome
         */
        System.out.println(isPalindrome("madam")); // Expected output: true

        /**
         * Test case 2: Check if "hello" is a palindrome
         */
        System.out.println(isPalindrome("hello")); // Expected output: false
    }
}


//Time complexity : o(1)

//space complexity: O(1); 