class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] answer= new int[n];
        //left product in answer
        answer[0]=1;
        for(int i=1;i<n;i++){
            answer[i]=answer[i-1]*nums[i-1];
        }
        int R=1;
        for(int i=n-1;i>=0;i--){
            answer[i]=answer[i]*R;
            R*=nums[i];
        }
        return answer;
    }



}