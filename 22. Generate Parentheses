/**
 * https://leetcode.com/problems/generate-parentheses/description/
 * 22. Generate Parentheses
 * @author Jiayu Yao
 */
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(3).toString());
    }
    static List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        helper(ans,"",n,n);
        return ans;
    }

    static void helper(List<String> list, String tempStr, int l, int r){
        if(l==0 && r==0)  list.add(tempStr);
        else{
            if(r > l)   helper(list, tempStr + ")", l, r - 1);
            if(l > 0)   helper(list, tempStr + "(", l - 1, r);
        }
    }
}
