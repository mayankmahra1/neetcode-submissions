class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        if(nums.length == 0){
            return 0;
        }

        // Removes duplicates and creates a set
        for(int num : nums){
            set.add(num); 
        }


        int answer = 0; 

        // iterate through each element in the set
        for(Integer num : set){

            if(!set.contains(num-1)){ // Its the start of a sequence
                int startSeq = num;
                int seqLength = 0; 
                boolean startSeqCheck = true; 

                while(startSeqCheck){
                    if(set.contains(startSeq++)){
                        seqLength++;
                    }
                    else{
                        if(seqLength > answer){
                            answer = seqLength;
                        }
                        startSeqCheck = false;
                    }
                }
            }

        }


        


        return answer;
    }
}


/* 
We have an array of integers 
We need to return the length of the longest consecutive sequence we can make 

First I had a case which just rejects arrays of size 0. It returns 0 as 
the longest consecutive sequence

I then created a HashMap and ArrayList 
I took use of the fact that hashmaps override duplicate keys and just 
set the value as anything. I did this using a for loop 

I then used another for loop to add all values to the array 

I then used Collections.sort to sort the array 

then I used a nested loop to compare values next to each other and kept 
track of the longest consecutive sequence 

I then returned the answer 

But my code is to inefficent
Inserting into the HashMap takes O(n)
copying keys into the ArrayList takes O(n)
sorting the list takes O(n log n)
My nested loops in worst case take O(n^2) 

So i need a better way to sort and to to 

*/ 

/*
The hint is asking is there any to identify the start of a sequence
IN 1,2,3,10,11,12 only 1 and 10 are the beginning of a sequence




*/ 
