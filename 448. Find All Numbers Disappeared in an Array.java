import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 * 448. Find All Numbers Disappeared in an Array
 * @author Jiayu Yao
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        boolean[] flags = new boolean[nums.length];
        for(int i = 0; i < nums.length; i++){
            flags[nums[i] - 1] = true;
        }

        for(int i = 0; i < flags.length; i++){
            if(flags[i] == false){
                result.add(i + 1);
            }
        }
        return result;
    }
}
