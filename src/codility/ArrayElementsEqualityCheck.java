package codility;
/*
   A and B each have an array of integers. A wants to change the array to match B. For each element
   of A's array, A can increment or decrement item in one move. How many moves will it take
   A to match B array. No reordering of the digit is allowed

   e.g) int[] a = new int[]{1234, 4321};
        int[] b = new int[]{2345, 3214};
        output = 10

        Sol: a[0] , b[0] -> [1234] to [2345] total 4 moves
        1 -> needs to increment 1
        2 -> needs to increment 1
        3 -> needs to increment 1
        4 -> needs to increment 1

           a[1] , b[1] -> [4321] to [3214] total 6 moves
        4 -> needs to decrement 1
        3 -> needs to decrement 1
        2 -> needs to decrement 1
        1 -> needs to increment 3

        So total move required for A and B to be equal is 4 + 6 = 10 moves
 */
public class ArrayElementsEqualityCheck {
    public static void main(String[] args) {
/*        int[] a = new int[]{123, 543};
        int[] b = new int[]{321, 279};*/
        int[] a = new int[]{1234, 4321};
        int[] b = new int[]{2345, 3214};
        int countMove = countMoveToEqualArrayElements(a, b);
        System.out.println("Total moves to equal arrays: " + countMove);
    }

    private static int countMoveToEqualArrayElements(int[] a, int[] b) {
        int aLength = a.length;
        int counter = 0;
        if (a.length != b.length) {
            throw new RuntimeException("Make sure both arrays have equal elements");
        }
        for (int i = 0; i < aLength; i++) {
            String as = String.valueOf(a[i]);
            String bs = String.valueOf(b[i]);

            for (int c = 0; c < as.length(); c++) {
                int aValue = Integer.parseInt(Character.toString(as.charAt(c)));
                int bValue = Integer.parseInt(Character.toString(bs.charAt(c)));
                while (aValue != bValue) {
                    if (aValue > bValue) {
                        aValue--;
                        counter++;
                    } else {
                        aValue++;
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}