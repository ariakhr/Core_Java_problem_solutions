package algorithms;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String args[]) {
        Integer N[] = {1,3,4,7,3,2,3,2,2,2};
        int key = 3;

        System.out.println("Using recurssion - Binary Search for the key " + key + " is found at index : " + binarySearchUsingRecurssion(N, 0, N.length, key));
        System.out.println("Using loop - Binary Search for the key " + key + " is found at index : " + binarySearchUsingLoop(N, 0, N.length, key));
    }

    private static int binarySearchUsingRecurssion(Integer N[], int first, int last,int key) {
        Arrays.sort(N);
        int mid = (first+last)/2;

        while(first < last) {
            if(N[mid] == key) {
                return mid;
            }
            if(N[mid] < key) {
                first = mid+1;
                return binarySearchUsingRecurssion(N, first, last, key);
            }
            if(N[mid] > key) {
                last = mid-1;
                return binarySearchUsingRecurssion(N, first, last, key);
            }
        }
        return 0;
    }

    private static int binarySearchUsingLoop(Integer N[], int first, int last,int key) {
        Arrays.sort(N);
        int mid = (first+last)/2;

        while(first < last) {
            if(N[mid] == key) {
                return mid;
            }
            if(N[mid] < key) {
                first = mid +1;
            }
            if(N[mid] > key) {
                last = mid-1;
            }
        }
        return 0;
    }
}
