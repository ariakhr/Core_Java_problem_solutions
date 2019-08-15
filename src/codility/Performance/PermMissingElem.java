package codility.Performance;

import java.util.Arrays;

/*
For example, given array A such that:

A[0] = 2
A[1] = 3
A[2] = 1
A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].*/
public class PermMissingElem {

    public static void main(String args[]) {

        //NOTE===============================
        // Here they expect atleast one output. Say i/p is 0, the missing element is 2 so o/p = 2
        // if i/p = 3,2, missing is 1, so return 1
        //Integer A[] = {1,2,3,4,5,6,7,8,10,11};
        //int A[] = { };
        //int A[] = {1,2,3,4,5,6,7,8,10,12};
        //int A[] = {0,2,3,4,5,6,7,8,10,11};
        //int A[] = {1};
        //int A[] = {2};
        int A[] = {1, 2};
        //int A[] = {3, 4};
        System.out.println("Missing element in the Array is : "+ solution(A));

    }

    public static int solution(int[] A) {
        int len = A.length;
        int missingNum = 0;
        Arrays.sort(A);
        if(len == 0) return 1;
        if(len == 1) {
            if(A[0] > 1) {
                return A[0] - 1;
            } else {
                return A[0] + 1;
            }
        }
        int startCount = 0;
        int endCount = len-1;
        for(int i=A[0],j = A[len-1]; i<=len/2; ) {
            i += 1;
            j -= 1;
            startCount += 1;
            endCount -= 1;

            if(i != A[startCount]) {
                missingNum = i;
                break;
            }
            if(j != A[endCount]) {
                missingNum = j;
                break;
            }
        }
        //Below check - in case missing element is not between the nums, we have to return next element in the array
        if(missingNum == 0) {
            if (A[0] > 1) {
                missingNum = A[0] - 1;
            } else {
                missingNum = A[len - 1] + 1;
            }
        }
        return missingNum;
    }
}
