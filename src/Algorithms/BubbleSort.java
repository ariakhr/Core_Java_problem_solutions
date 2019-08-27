package Algorithms;

import java.util.Arrays;
import java.util.stream.Collectors;

/*Bubble Sort
        Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
        Example:
        First Pass:
        ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
        ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
        ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
        ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

        Second Pass:
        ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
        ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
        ( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
        Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.

        Third Pass:
        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
        ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )*/
public class BubbleSort {

    public static void main(String args[]) {
        Integer N[] = {1, 3, 4, 7, 3, 2, 3, 2, 2, 2};

        System.out.println("Sorted Array " + Arrays.stream(bubbleSort(N)).map(n -> n.toString()).collect(Collectors.joining(",", "[", "]")));
        System.out.println("Optimized Sorted Array " + Arrays.stream(optimisedBubbleSort(N)).map(n -> n.toString()).collect(Collectors.joining(",", "[", "]")));
    }

    private static Integer[] bubbleSort(Integer[] n) {
        int len = n.length - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
        return n;
    }

    //In case there are no swap required, it means aleady sorted and return the result in O(n)
    private static Integer[] optimisedBubbleSort(Integer[] n) {
        int len = n.length - 1;
        boolean swapped = false;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) {
                break;
            }
        }
        return n;
    }

}
