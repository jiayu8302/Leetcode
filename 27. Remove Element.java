/**
 *https://leetcode.com/problems/remove-element/description/
 * 27. Remove Element
 * @author Jiayu Yao
 */
class Solution {
    public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
   } 
}
