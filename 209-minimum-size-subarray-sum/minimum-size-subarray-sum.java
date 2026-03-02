class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l =0 ;
        int sum =0 ;
        int n =nums.length;
        int ml =Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum >= target){
                ml =Math.min(ml,r-l+1);
                sum -=nums[l];
                l++;
            }
        }
        return ml == Integer.MAX_VALUE ? 0 : ml;   
        // if(ml== Integer.MAX_VALUE)
        // return 0'
        // else
        //retrun ml;
         }
}