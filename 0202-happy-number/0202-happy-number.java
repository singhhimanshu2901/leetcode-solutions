class Solution {
    public boolean isHappy(int n) {
        int rem,rev,temp,i=0;
        while(i<=1000){
        temp=n;    
        rev=0;    
        while(temp!=0){
        rem = temp%10;
        rev = rev+ (rem*rem);
        temp=temp/10;
        }
        i++;
        if(rev==1){
            return true;}
        n=rev;
        }
        return false;
    }
}