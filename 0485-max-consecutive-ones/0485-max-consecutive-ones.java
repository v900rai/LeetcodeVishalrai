class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int count=0;
      int ans=0;
      for(int i=0; i<nums.length; i++){
        if(nums[i]==1){
          count++;
          ans=Math.max(count, ans);

        }
        else{
          count=0;
        }
      }
        return ans;
    }
}