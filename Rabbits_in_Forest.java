    public class Rabbits{
       public int numRabbits(int[] answers) {
       HashMap<Integer, Integer> hm = new HashMap<>();
        int result = 0;
        for(int i = 0; i < answers.length; i++){
            if(!hm.containsKey(answers[i])){
                hm.put(answers[i], 1);
            }else{
                hm.put(answers[i], hm.get(answers[i]) + 1);
            }
        }
        Set<Integer> keys = hm.keySet();
        Iterator<Integer> iter = keys.iterator();
        while(iter.hasNext()){
            int curKey = iter.next();
            int curValue = hm.get(curKey);
            result += curValue / (curKey + 1) * (curKey + 1);
            if(curValue % (curKey + 1) != 0){
                result += (curKey + 1);
            }
        }
        return result;
        }
    }
