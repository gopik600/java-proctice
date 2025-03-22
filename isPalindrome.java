class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int or=x;
        int re=0;
        while(x!=0)
        {
            int digit=x%10;
            re=re*10+digit;
            x=x/10;
        }
        if(re==or)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
