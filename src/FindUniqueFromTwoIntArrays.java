import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/*Problem stmt: Given two arrays M and N of integers. Compare both the arrays of ints and return only unique integers of
 the two arrays. Duplicates should be removed as well.*/
public class FindUniqueFromTwoIntArrays {

    public static void main(String[] args) {

        Integer N[] = {1,3,4,7,3,2,3,2,2,2};
        Integer M[] = {1,3,5,8,5,3};

        Set<Integer> nWithoutDup = Arrays.stream(N).collect(Collectors.toSet());
        Set<Integer> mWithoutDup = Arrays.stream(M).collect(Collectors.toSet());

        for(int m: mWithoutDup) {
            if(nWithoutDup.contains(m)) {
                nWithoutDup.remove(m);
            } else {
                nWithoutDup.add(m);
            }
        }

        System.out.println("Unique entries after comparing arrays N and M are : " + nWithoutDup.toString());
    }
}
