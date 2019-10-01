package core;

import org.apache.commons.lang3.StringUtils;

public class LongestPalindromeDemo {

    public static void main(String args[]) {
        System.out.println("Longest Palindrome in given word : " + solution("bananas"));
    }

    private static String solution(String str) {
        String longest = "";
        if(StringUtils.isBlank(str)) {
            return "0";
        }

        if(str.length() == 1) {
            return "1";
        }

        longest = str.substring(0,1);

        for(int i=0; i < str.length(); i++) {
            String temp = checkLongest(str, i, i);
        }
        return longest;
    }

    private static String checkLongest(String str, int begin, int end) {

        while((begin >= str.length() && end <= str.length()-1) && (str.charAt(begin) == str.charAt(end))) {
            begin--;
            end++;
        }

        return str.substring(begin, end);
    }

}
