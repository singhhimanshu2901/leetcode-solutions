class Solution {
    public boolean isPalindrome(String s) {
        String t = new String();
        for(int i=0 ; i<s.length() ; i++){
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)<=57 && s.charAt(i)>=48)){
                char ch = s.charAt(i);
                t=t+Character.toLowerCase(ch);
            }
        }
        String reversed = new StringBuilder(t).reverse().toString();
        return t.equals(reversed);
    }
}