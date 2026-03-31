class Solution {
    public void moveZeroes(int[] nums) {
        int nozero = 0;                                      
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
             int temp = nums[nozero];
             nums[nozero++]=nums[i];
             nums[i]=temp;}
        }
    }
}
