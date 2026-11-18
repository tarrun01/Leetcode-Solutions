class Solution {
    public int minMoves(int[] nums) {
     int s=0,d=0,m=0;
     if(nums.length==1)
     return 0;
     for(int i=0;i<nums.length;i++)
     {
        m=Math.max(m,nums[i]);
     } 
     for(int i=0;i<nums.length;i++)
     {
        d=m-nums[i];
        s+=d; 
     }  
     return s;
    }
}