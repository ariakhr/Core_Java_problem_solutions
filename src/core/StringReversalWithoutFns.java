package core;

import java.util.Arrays;

public class StringReversalWithoutFns {

    public static void main(String args[]){
        String str = "viju Joseph";
        System.out.println("Reverse of string " + str + " : " + solution(str));
    }

    private static String solution(String str) {

        char elements[] = str.toCharArray();
        int len = str.length()-1;
        for(int i=0;i<str.length()/2;i++) {
            char temp = elements[i];
            elements[i] = elements[len-i];
            elements[len-i] = temp;
        }

        return Arrays.toString(elements);
    }
}
