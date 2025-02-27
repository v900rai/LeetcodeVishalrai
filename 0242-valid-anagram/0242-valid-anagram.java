class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
        return false;
       }
     
         // Convert strings to character arrays and sort them
        char[] sArray=s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare the sorted arrays
        return Arrays.equals(sArray, tArray);
        
    }
}