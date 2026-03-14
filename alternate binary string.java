class Solution {
    public int minOperations(String s) {
        int changeforpattern0=0;
        int n = s.length();
        for(int i =0;i<n;i++){
            if(i%2==0){
                if(s.charAt(i)!='0'){
                changeforpattern0++;
                }
            }
                else{
                    if(s.charAt(i)!='1'){
                    changeforpattern0++;
   
                }
            }
        }
                int changeforpattern1 = n-changeforpattern0;
                return Math.min(changeforpattern0, changeforpattern1);
    }
}
