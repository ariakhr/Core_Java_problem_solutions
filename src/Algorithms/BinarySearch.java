package Algorithms;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String args[]) {
        Integer N[] = {1,3,4,7,3,2,3,2,2,2};
        int key = 3;

        System.out.println("Using recurssion - Binary Search for the key " + key + " is found at index : " + binarySearchUsingRecurssion(N, 0, N.length, key));
        System.out.println("Using loop - Binary Search for the key " + key + " is found at index : " + binarySearchUsingLoop(N, 0, N.length, key));
    }

    public static int binarySearchUsingRecurssion(Integer N[], int first, int last,int key) {
        Arrays.sort(N);
        int mid = (first+last)/2;

        while(first < last) {
            if(N[mid] == key) {
                return mid;
            }
            if(N[mid] < key) {
                return binarySearchUsingRecurssion(N, mid+1, last, key);
            }
            if(N[mid] > key) {
                return binarySearchUsingRecurssion(N, first, mid-1, key);
            }
        }
        return 0;
    }

    public static int binarySearchUsingLoop(Integer N[], int first, int last,int key) {
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
