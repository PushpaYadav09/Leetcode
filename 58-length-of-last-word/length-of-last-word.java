class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!= ' '){
                count++;
            }
            else{
                 count=0;
            }
        }
        return count;
    }
}