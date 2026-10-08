
class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>(); 

        for(Integer num : nums){
            set.add(num);
        }


        if (set.size() != nums.length)  {
            return true;
        }
        else{
            return false; 
        }

    }
}