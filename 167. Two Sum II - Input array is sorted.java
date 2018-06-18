/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 * 167. Two Sum II - Input array is sorted
 * @author Jiayu Yao
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result[] = new int[2];
        int i = 0, j = numbers.length - 1;
        while(i != j){
            if(numbers[i] + numbers[j] > target){
                j--;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }else{
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            }
        }
        return result;
    }
}