class Solution {
    public int characterReplacement(String s, int k) {
       int[] feq = new int[26]; //bcz of uppercase letters
       int left =0;
       int maxlen =0;
       int maxfeq=0;
       //expand right
       for(int right =0 ;right<s.length();right++){
        char ch =s.charAt(right);
        feq[ch-'A']++;
        maxfeq=Math.max(maxfeq,feq[ch - 'A']); //update max frequency
        //check if window in invalid
        //windowsize - maxfeq <k
        while((right -left + 1) - maxfeq >k){
            feq[s.charAt(left) -'A']--;
            left++;
        }
        //update maxlen
        maxlen=Math.max(maxlen , right -left +1);
       } 
       return maxlen;
    }
}