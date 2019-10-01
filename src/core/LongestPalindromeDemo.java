package core;

import org.apache.commons.lang3.StringUtils;

public class LongestPalindromeDemo {

    public static void main(String args[]) {
        //longest palindrome in below word is - 123321
        System.out.println("Longest Palindrome in given word : " + solution("helloradar123321"));

        //longest palindrome in below word is - anana
        System.out.println("Longest Palindrome in given word : " + solution("bananas"));

        //longest palindrome in below word is - radar
        System.out.println("Longest Palindrome in given word : " + solution("abaradar121"));

        //longest palindrome in below word is - c
        System.out.println("Longest Palindrome in given word : " + solution("c"));
    }

    private static String solution(String str) {
        String longest = "";
        //If string is blank
        if(StringUtils.isBlank(str)) {
            return "0";
        }

        //If string length is 1, return the same
        if(str.length() == 1) {
            return str;
        }

        //initally set longest as first letter
        longest = str.substring(0,1);

        for(int i=0; i < str.length()-1; i++) {
            String temp = checkLongest(str, i, i);

            //to check paliandrom for odd, e.g) radar (5 length)
            if(temp.length() > longest.length()) {
                longest = temp;
                continue;
            }

            //to check paliandrom for odd, e.g) 123321 (6 length)
            temp = checkLongest(str, i, i+1);
            if(temp.length() > longest.length()) {
                longest = temp;
            }
        }
        return longest;
    }

    private static String checkLongest(String str, int begin, int end) {

        //logic here is to iterate one char to left and right and see if its matching
        while((begin >= 1 && end <= str.length()-2) && (str.charAt(begin-1) == str.charAt(end+1))) {
            begin--;
            end++;
        }
        return str.substring(begin, end+1);
    }

}
