package codility.arrayexamples;

import java.util.Arrays;
/*
    For example, given

    A = [3, 8, 9, 7, 6]
    K = 3
    the function should return [9, 7, 6, 3, 8]. Three rotations were made:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
    For another example, given

    A = [0, 0, 0]
    K = 1
    the function should return [0, 0, 0]

    Given

    A = [1, 2, 3, 4]
    K = 4
    the function should return [1, 2, 3, 4]
*/
public class CyclicRotation {
    public static void main(String args[]) {

        //int A[] = {3, 8, 9, 7, 6};
        //int A[] = {0,0,0};
        int A[] = {-4};
        int K = 0;
        Arrays.stream(solution(A, K)).forEach( n -> System.out.print(n));
    }

    public static int[] solution(int[] A, int K) {
        int count = 0;
        int len = A.length-1;
        int rotatedNums[] = new int[A.length];
        //If K == 0, negative test case is very important
        if(K == 0) {
            return A;
        }
        while(count < K) {
            boolean flag = false;
            for(int j=0;j<A.length;j++) {
                if(rotatedNums[j] != 0) { flag = true; break;}
            }
            if(flag) {
                A = Arrays.copyOf(rotatedNums,rotatedNums.length);
            }
            for (int i = 0; i <= len; i++) {
                if (i == 0) {
                    rotatedNums[0] = A[len];
                    continue;
                }
                rotatedNums[i] = A[i-1];
            }
            count++;
        }
        return rotatedNums;
    }
}
