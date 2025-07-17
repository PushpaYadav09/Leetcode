class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] noteArr = ransomNote.toCharArray();
        char[] magArr = magazine.toCharArray();

        Arrays.sort(noteArr); 
        Arrays.sort(magArr); 

        int i = 0, j = 0;
        while (i < noteArr.length && j < magArr.length) {
            if (noteArr[i] == magArr[j]) { 
                i++; // Move ransomNote pointer
            }
            j++; // Always move magazine pointer
        }

        return i == noteArr.length; // Check if all letters in ransomNote were matched
    }
    }