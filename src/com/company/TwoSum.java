package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args){


        System.out.println("Hello World");
        int nums[] = {2, 7, 11, 15};
        int target = 17;
//        for (int i = 0; i < 2; i++)
//          System.out.println(twoSum (nums, target)[i]);
        System.out.println(Arrays.toString (twoSum (nums, target)));

    }

//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    return new int[] { i, j };
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                result[0] = index + 1;
                result[1] = i + 1;
                return result;
            }
            map.put(target - nums[i], i);
        }
        throw new IllegalArgumentException ( "No two sum solution" );
    }
}
