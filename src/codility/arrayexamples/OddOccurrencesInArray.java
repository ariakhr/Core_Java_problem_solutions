package codility.arrayexamples;

import java.util.Arrays;

/*
        For example, in array A such that:

        A[0] = 9  A[1] = 3  A[2] = 9
        A[3] = 3  A[4] = 9  A[5] = 7
        A[6] = 9
        the elements at indexes 0 and 2 have value 9,
        the elements at indexes 1 and 3 have value 3,
        the elements at indexes 4 and 6 have value 9,
        the element at index 5 has value 7 and is unpaired.
        Write a function:

        A[0] = 9  A[1] = 3  A[2] = 9
        A[3] = 3  A[4] = 9  A[5] = 7
        A[6] = 9
        the function should return 7, as explained in the example above.
*/
public class OddOccurrencesInArray {
    public static void main(String args[]) throws Exception {

        //int A[] = {9,3,9,3,9,7,9,3,4};
        //int A[] = {1,2,1,2,5};
        int A[] = {3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int unpairedNum = -1;
        int N = A.length;
        if (N == 1) {
            return A[0];
        }
        int count = 0;
        for (int i = 0; i < A.length - 1; i = i + 2) {
            count = i + 2;
            if (A[i] != A[i + 1]) {
                unpairedNum = A[i];
                break;
            }
        }
        if (count == N - 1) {
            unpairedNum = A[N - 1];
        }
        return unpairedNum;
    }
}
