/**
 * https://leetcode.com/problems/missing-number/description/
 * 268. Missing Number
 * @author Jiayu Yao
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int result = 0;
        int standard[] = new int[nums.length + 1];
        for(int i = 0; i < standard.length; i++){
            standard[i] = -1;
        }
        for(int i = 0; i < nums.length; i++){
            standard[nums[i]] = nums[i];
        }
        for(int i = 0; i < standard.length; i++){
            if(standard[i] == -1) result = i;
        }
        return result;
    }
}