package core;

import java.util.Arrays;

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

    public static class VarargsExample {

        public static void main(String args[]) {
            print(101,"Beck","Ethan","Luca","Mark");
        }

        public static void print(int id, String...args) {
            System.out.println("Id :" + id);
            Arrays.stream(args).forEach(a-> System.out.println(a));
        }
    }
}
