class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){//if string is empty retrun new empty list
            return new ArrayList();
        }
        Map<String,List> ansMap =new HashMap<>();
        int[] count = new int[26];//new array of size 26
        for(String s : strs){
            Arrays.fill(count,0);//first initalize the array with zero
             for(char c : s.toCharArray()){//to itreate and initailze the array with 
                count[c-'a']++; //char by adding values from 0 to 1 (frequenscy)
             }
             StringBuilder sb = new StringBuilder(" ");//stringbuilder to store stringvalues 
                                                   // retrived from charr array
            for(int i=0;i<26;i++){ // for ;oop accross the count to store values from sb
                sb.append("#");
                sb.append(count[i]);
            }
            String key =sb.toString(); // assign sb to as a key for map
            if(!ansMap. containsKey(key)){
                ansMap.put(key,new ArrayList<>());//if the key is not there,add 
            }
            ansMap.get(key) .add(s);//if yes, update value
        }
        return new ArrayList(ansMap.values()); //return values of map as list
    }
}