/* https://leetcode.com/problems/longest-absolute-file-path/description/
   388. Longest Absolute File Path
*/
class Solution {
    public static void main(String[] args) {
        int n = lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext");
        System.out.println(n);
    }
    static int lengthLongestPath(String input) {
        int maxLen = 0;
        String[] paths = input.split("\n");
        int[] stack = new int[paths.length + 1];
        for(String s : paths){
            int lev = s.lastIndexOf("\t") + 1;      //number of "\t"
            stack[lev + 1] = stack[lev] + s.length() - lev + 1;  //length until (lev+1)th level of index
            int curlen = stack[lev + 1];
            if(s.contains(".")) maxLen = Math.max(maxLen, curlen - 1);
        }
        return maxLen;
    }
}