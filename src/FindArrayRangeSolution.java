// Given an integer array, return the summary of its ranges.
// For example, given [0,1,2,4,5,2,7], return ["0->2","4->5","7"].

import java.util.*;
import java.util.stream.Collectors;

public class FindArrayRangeSolution {

    public static void main(String args[]){

        Integer nums[] = {0,1,2,4,5,2,7,4,7,2,8,9,10,12};
        //Integer nums[] = {12};

        //Sorting
        Arrays.sort(nums);
        Set<Integer> uniqueNums = Arrays.asList(nums).stream().collect(Collectors.toSet());
        nums = uniqueNums.toArray(Integer[]::new);

        List<String> result = new ArrayList<>();
        int count = 0;
        int num = nums[0];
        int i =0;

        if(nums.length == 1) {
            result.add(num + "");
        }

         while(i < nums.length-1) {
            i++;
            if(i==nums.length-1) {
                if(count > 0) {
                    result.add(num + "->" +nums[i]);
                } else {
                    result.add(num + "");
                }
                break;
            }
            if(nums[i]+1 == nums[i+1]) {
                count++;
                continue;
            }

            if(count > 0) {
                result.add(num + "->" +nums[i]);
            } else {
                result.add(num + "");
            }
            count = 0;
            num = nums[i+1];

        }
        System.out.println(result);

    }
}
