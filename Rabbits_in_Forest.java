/* https://leetcode.com/problems/rabbits-in-forest/description/
   781. Rabbits in Forest
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input[] = new int[3];
        for(int i = 0; i < 3; i++){
            input[i] = sc.nextInt();
        }

        int n = numRabbits(input);
        System.out.println(n);
    }
    static int numRabbits(int[] answers){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < answers.length; i++){
            int num = answers[i];
            int current = map.getOrDefault(num,0);
            map.put(num,current + 1);
        }
        int result = 0;
        for(Integer key : map.keySet()){
            result += map.get(key) / (key + 1) * (key + 1);
            if(map.get(key) % (key + 1)!= 0){
                result += (key + 1);
            }
        }
        return result;
     }
}
