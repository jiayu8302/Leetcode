/*https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
  17. Letter Combinations of a Phone Number
 */
import java.util.LinkedList;
import java.util.List;

public class solution {
    public static void main(String[] args) {
        System.out.println(letterCombinations("012").toString());
    }
    static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<>();
        String[] mapping = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ans.add("");
        for(int i = 0; i < digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length() == i){
                String s = ans.remove();
                for(char c : mapping[x].toCharArray()){
                    ans.add(s + c);
                }
            }
        }
        return ans;
    }
}