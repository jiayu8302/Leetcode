/**
 * https://leetcode.com/problems/pascals-triangle/description/
 * 118. Pascal's Triangle
 * @author Jiayu Yao
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0) return result;
        result.add(new ArrayList<>());
        result.get(0).add(1);

        for(int i = 1; i < numRows; i++){
            List<Integer> curRow = new ArrayList<>();
            List<Integer> preRow = result.get(i - 1);
            curRow.add(1);
            for(int j = 1; j < i; j++){
                curRow.add(preRow.get(j - 1) + preRow.get(j));
            }
            curRow.add(1);
            result.add(curRow);
        }
        return result;
    }
}