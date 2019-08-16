package codility.Performance;

/*      For example, given:

        X = 10
        Y = 85
        D = 30
        the function should return 3, because the frog will be positioned as follows:

        after the first jump, at position 10 + 30 = 40
        after the second jump, at position 10 + 30 + 30 = 70
        after the third jump, at position 10 + 30 + 30 + 30 = 100
        Write an efficient algorithm for the following assumptions:

        X, Y and D are integers within the range [1..1,000,000,000];
        X ≤ Y.*/
public class FrogJumpSolution {

    public static void main(String args[]) {
        //Test case 1
/*        int X = 7;
        int Y = 999;
        int D = 40;*/

        //Test case 2
      /*  int X = 1;
        int Y = 10000000;
        int D = 10000000;*/

        //Test case 3
        int X = 10;
        int Y = 9;
        int D = 1;
        System.out.println("Steps required to reach Y destination :" + solution(X,Y,D));
    }

    //Correct and excellent performance (Time Complexity = O(1))
    public static int solution(int X, int Y, int D) {
        //If X and Y are equals or X is greater than Y, return Zero
        if( (Y-X) == 0 || X >= Y) {
            return 0;
        } else {
            double result = Y-X;
            result = result/D;
            if(result > (int)result)
                result +=1;
            return (int)result;
        }
    }

    //Correct solution but very poor performance
    public static int solution1(int X, int Y, int D) {
        int count = 0;
        while(X < Y) {
            X = X + D;
            count++;
        }
        return count;
    }
}
