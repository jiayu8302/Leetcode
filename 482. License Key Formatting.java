/**
 * https://leetcode.com/problems/license-key-formatting/description/
 * 482. License Key Formatting
 * @author Jiayu Yao
 */
public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for(int i = S.length() - 1; i > -1; i--){
            if(S.charAt(i) == '-')  continue;
            else if(count < K){
                result.append(S.substring(i, i + 1));
                count++;
            }else{
                count = 0;
                result.append("-");
                i++;
            }
        }
        result = result.reverse();
        return result.toString().toUpperCase();
    }
}
