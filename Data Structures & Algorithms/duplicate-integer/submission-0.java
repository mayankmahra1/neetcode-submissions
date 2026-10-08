
class Solution {
    public boolean hasDuplicate(int[] nums) {


    // brute force approach 
    // O(n^2)
    /*    for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }

        return false; */    
    


    // sort and then compare to the value next to it 
    // O(n log n)

    /*
    // Arrays class
    // Arrays.sort(nums); 


    for(int i = 0; i < nums.length-1; i++){
        if(nums[i] == nums[i+1]){
            return true;
        }
    }
    return false; */


    // using hashsets 
    // O(n)
    Set<Integer> seen = new HashSet<>(); 

    for(int num : nums){
        if(seen.contains(num)){
            return true; 
        }
        seen.add(num); 
    }

    return false;

   


    

    

        
    }
}