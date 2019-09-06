import java.util.Arrays;

/*
Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains same characters, only the order of characters can be different. For example, “act” and “tac” are anagram of each other.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case consist of two strings in 'lowercase' only, in a single line.

Output:
Print "YES" without quotes if the two strings are anagram else print "NO".

Constraints:
1 ≤ T ≤ 300
1 ≤ |s| ≤ 1016

Example:
Input:
2
abc cba
allergy allergic

Output:
YES
NO

Explanation:
Testcase 1: Both the string have same characters with same frequency. So, both are anagrams.
Testcase 2: Characters in both the strings are not same, so they are not anagrams.
 */
public class StringsAnagramCheck     {

    public static void main(String args[]) {
        String a = "allergy";
        String b = "allergic";
        System.out.println(isStringsAnagram(a,b));
    }

    private static Object isStringsAnagram(String a, String b) {

        //If length of both strings doesn't match, then both are not anagrams
        if(a.length() != b.length()) {
            return "NO";
        }
        char aStr[] = a.toCharArray();
        char bStr[] = b.toCharArray();

        //Need to sort for fast and easy process
        Arrays.sort(aStr);
        Arrays.sort(bStr);

        //Since both strings are sorted, both should have same length and should remain same chars at same index,
        // other wise return as not matching
        for(int i=0; i<aStr.length; i++) {
            if(aStr[i]!=bStr[i]) {
                return "NO";
            }
        }

        return "YES";
    }

}
