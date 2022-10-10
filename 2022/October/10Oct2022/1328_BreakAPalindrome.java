class Solution {
    public String breakPalindrome(String palindrome) {
        int len = palindrome.length();
        if(len==1)
            return "";
        char[] chArr = palindrome.toCharArray();
        for(int i=0;i<len/2;i++) {
            if(chArr[i] != 'a') {
                chArr[i] = 'a';
                return String.valueOf(chArr);
            }
        }
        chArr[len-1] = 'b';
        return String.valueOf(chArr);
    }
}
