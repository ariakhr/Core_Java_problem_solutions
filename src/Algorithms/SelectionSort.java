package Algorithms;

import java.util.Arrays;
import java.util.stream.Collectors;

/*arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]
// and place it at beginning
        11 25 12 22 64

// Find the minimum element in arr[1...4]
// and place it at beginning of arr[1...4]
        11 12 25 22 64

// Find the minimum element in arr[2...4]
// and place it at beginning of arr[2...4]
        11 12 22 25 64

// Find the minimum element in arr[3...4]
// and place it at beginning of arr[3...4]
        11 12 22 25 64*/
public class SelectionSort {

    public static void main(String args[]) {
        Integer N[] = {45, 15, 64, 11, 22, 75};

        System.out.println("Sorted Array " + Arrays.stream(selectionSort(N)).map(n -> n.toString()).collect(Collectors.joining(",", "[", "]")));
    }

    private static Integer[] selectionSort(Integer[] n) {
        int len = n.length;
        for (int i = 0; i < len; i++) {
            int min_idx = i;
            for(int j=i+1 ; j < len-1 ; j++) {
                if(n[min_idx] > n[j]) {
                    min_idx = j;
                }
            }

            int temp = n[i];
            n[i] = n[min_idx];
            n[min_idx] = temp;
        }
        return n;
    }
}
