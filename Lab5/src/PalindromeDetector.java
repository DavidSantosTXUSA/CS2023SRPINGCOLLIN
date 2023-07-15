public class PalindromeDetector {
    public static void main(String[] args) {
        String S1 = "Able was I, ere I saw Elba";
       if(isPalindrome(S1))
        {
            System.out.println(S1 + " is a palindrome");
        }else
        {
            System.out.println(S1 + " is not a palindrome");
        }
        S1 = "A man, a plan, a canal, Panama";
        if(isPalindrome(S1))
        {
            System.out.println(S1 + " is a palindrome");
        }else
        {
            System.out.println(S1 + " is not a palindrome");
        }
       S1 = "Desserts, I stressed";
        if(isPalindrome(S1))
        {
            System.out.println(S1 + " is a palindrome");
        }else
        {
            System.out.println(S1 + " is not a palindrome");
        }
        S1 = "Kayak";
        if(isPalindrome(S1))
        {
            System.out.println(S1 + " is a palindrome");
        }else
        {
            System.out.println(S1 + " is not a palindrome");
        }
        S1 = "The red car";
        if(isPalindrome(S1))
        {
            System.out.println(S1 + " is a palindrome");
        }else
        {
            System.out.println(S1 + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String s)
    {
        //ensures commas and spaces and captial letters
        //are not considered
        s = s.replaceAll("\\s", "");
        s = s.replaceAll(",", "");
        s = s.toLowerCase();
        //base case, since any 1 letter word will be
        // palindrome and 0 letters means we looped all
        // the way through the word or sentence without getting false once
        if(s.length() == 0 || s.length() == 1)
        {
            return true;
        }
        // if first and last are the same
        // then we remove the first and last and recall the method
        // this is the recursion happening

        if(s.charAt(0) == s.charAt(s.length()-1))
        {
            return isPalindrome(s.substring(1, s.length()-1));
        }
        return false; // if first and last are not the same then it is not a palindrome
    }
}