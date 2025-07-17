class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); //sort array makr it easy to itreate as duplicates will be 2gather
        HashSet<Integer> set = new HashSet<>();//hashset to store elements uniquely no      
                                            //duplcates allowed
         for(int num : nums)   {
            if(set.contains(num)){ //if the set contains element
                return true; //retun ture
            }
            set.add(num); //if the set does not contain it , add to set the element
         }   
         return false; // if the array has unique elements , 
                      //will return false  

    }
}