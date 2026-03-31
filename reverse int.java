class Solution {
    public int reverse(int x) {
        long s = 0;
        while(x!=0){
           int r = x % 10;
            x = x/10;
            s =(s*10)+r;
        }
        if(s > Integer.MAX_VALUE || s < Integer.MIN_VALUE){
            return 0;
        }
        return(int)s;
    }
}
