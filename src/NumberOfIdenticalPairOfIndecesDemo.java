import java.util.Arrays;

/*An array A consisting of N integers is given. We are looking for
        pair of elements of the array that are equal but they occupy
        different positions in the array. The goal is to calculate the
        number of identical pairs of indices

        e.g:

        A[0] = 3
        A[1] = 5
        A[2] = 6
        A[3] = 3
        A[4] = 3
        A[5] = 5

        There are four pairs of identical indices: (0,3), (0,4), (1,5)
        and (3,4). Note that pairs (2,2) and (5,1) are not counted
        since their first indices are not smaller than thier second.*/

public class NumberOfIdenticalPairOfIndecesDemo {
    public static void main(String args[]) {
        int A[] = {3, 5, 6, 3, 3, 5, 3, 5};
        //int A[] = {};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int count = 0;
        if(A.length <= 1) {
            return count;
        }
        if(A.length ==2) {
            if(A[0]==A[1]) {
                return 1;
            } else {
                return count;
            }
        }
        for(int i=0; i< A.length-1; i++) {
            for(int j=i;j < A.length-1; j++){
                if(A[i]==A[j+1]) {
                    count++;
                } else {
                    break;
                }
                if(count == 1000000000) {
                    return 1000000000;
                }
            }
        }
        return count;
    }
}