class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i= 0, j= 0;
        int n = word1.length(), m = word2.length();
        while(i<n && j< m){
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(j));
            i++;
            j++;
        }
        if(i<n){
            merged.append(word1.substring(i));
        }
        if(j<m){
            merged.append(word2.substring(j));
        }
        return merged.toString();
    }
}
