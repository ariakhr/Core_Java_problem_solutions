package core;

/*
If the input is test12345, we will iterate as below and compare if S2 contains the below substring
1. t (t contain in s2), te, tes, test, test1, test12, test123, test1234, test12345
2. e , es, est, est1, est12, est123, est1234, est12345
3. s, st, st1, st12, st123, st1234, st12345
3. t, t1, t12, t123, t1234 (contains in s2, hence longest), st12345
and continue till loops ends
*/
public class LongestCommonSequenceFromTwoStrings {

    public static void main(String args[]) {
        String one = "test12345";
        String two = "tadt12347";
        System.out.println("longest common seq from string '" + one + "' & '" + two + "' is : " + solution(one, two));
    }

    private static String solution(String str1, String str2) {
        int longest = 0;
        String longestSubStr = "";

        for(int i=0;i < str1.length() ; i++) {
            for(int j= i+1; j < str1.length(); j++) {
                String subStr = str1.substring(i,j);
                if(str2.contains(subStr) && subStr.length() > longest) {
                    longest = subStr.length();
                    longestSubStr = subStr;
                }
            }
        }

        return longestSubStr;
    }

}
