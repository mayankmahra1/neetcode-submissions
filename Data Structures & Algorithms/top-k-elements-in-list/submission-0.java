class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>(); 

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1); 
            }
            else{
                int count = map.get(nums[i]); 
                map.put(nums[i], count + 1);
                 
            }
        }

        int[] answer = new int[k];

        for (int i = 0; i < k; i++) {
            int mostFrequentKey = 0;
            int highestFrequency = -1;

            for (Integer key : map.keySet()) {
                int frequency = map.get(key);

                if (frequency > highestFrequency) {
                    highestFrequency = frequency;
                    mostFrequentKey = key;
                }
            }

            answer[i] = mostFrequentKey;
            map.remove(mostFrequentKey);
        }

        return answer;
        
    }
}
