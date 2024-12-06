// https://leetcode.com/problems/longest-substring-without-repeating-characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String lngSubStrNow = "";
        int flag = 0;
        int pos = 0;
        String lngNow = "";
        for(int i = 0; i < s.length();i++){
            for(int j = 0; j < lngSubStrNow.length(); j++){
                if(lngSubStrNow.substring(j,j+1).equals(s.substring(i,i+1))){
                    flag = 1;
                    pos = j+1;
                    break;
                }
            } 
            lngSubStrNow += s.substring(i,i+1);
            
            if (flag == 1){
                lngSubStrNow = lngSubStrNow.substring(pos);
            }
            if (lngNow.length() <= lngSubStrNow.length()){
                lngNow = lngSubStrNow;
            }
            pos = 0;
            flag = 0;
        }
        return lngNow.length();
    }
}