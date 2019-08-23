import java.util.HashMap;
import java.util.Map;

/*
Given an array of Integers, find how many times each given number in array is repeated.
*/
public class NumOfRepetitionInArray {

    public static void main(String args[]) {
        int N[] = {1,3,5,4,2,6,7,8,9,2,5,1,1,8,8,8,8};
        Map<Integer, Integer> repeatedNums = new HashMap<>();

        for(Integer n: N) {
            if(repeatedNums.containsKey(n)) {
                repeatedNums.put(n,repeatedNums.get(n)+1);
            } else {
                repeatedNums.put(n, 0);
            }
        }

        repeatedNums.forEach( (K,V) -> System.out.println("Key " + K.toString() + " & " + "Repetition count: " + V.toString()));
    }
}
