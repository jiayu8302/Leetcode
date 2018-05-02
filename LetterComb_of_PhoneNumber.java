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
            int x = Character.getNumericValue(digits.charAt(i));  //extract phone number digit, prepare to map
            while(ans.peek().length() == i){                 //only change elements that are not touched in this round
                String s = ans.remove();                     //extract top element in ans
                for(char c : mapping[x].toCharArray()){      //append each value in the mapping to each existing element
                    ans.add(s + c);
                }
            }
        }
        return ans;
    }
}