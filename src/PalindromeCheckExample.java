public class PalindromeCheckExample {

    public static void main(String args[]) {
        //String str = "Malayalam";
        String str = "tteett";

        System.out.println("Is the word '" + str + "' Palindrome? " + isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        char s1[] = str.toLowerCase().toCharArray();
        int len = s1.length-1;
        for(int i=0; i<s1.length/2; i++){
            if(s1[i] != s1[len-i]) {
                return false;
            }
        }
        return true;
    }
}
