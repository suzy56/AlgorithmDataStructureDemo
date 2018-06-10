package alogrithmTest.day0610;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 给定 nums = [2, 7, 11, 15], target = 9

 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] targetNums = new int[2];
        for(int i=0; i < nums.length; i++){
            int x = nums[i];
            for(int j=0; j < nums.length; j++){
                if( target - x == nums[j] && i != j){
                    targetNums[0] = i;
                    targetNums[1] = j;
                    return targetNums;

                }
            }
        }
        return targetNums;
    }

    public static void main(String[] args) {
        int[]  ss = new Solution().twoSum(new int[]{2,7,11,15},9);
        System.out.print("["+ss[0]+","+ss[1]+"]");
    }
}