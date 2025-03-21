public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        
        Integer maj1 = null;
        int count1 = 0;

        Integer maj2 = null;
        int count2 = 0;
        
        for (int num : nums) {
            if (maj1 != null && num == maj1) {
                count1++;
            } else if (maj2 != null && num == maj2) {
                count2++;
            } else if (count1 == 0) {
                maj1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                maj2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (maj1 != null && num == maj1) {
                count1++;
            } else if (maj2 != null && num == maj2) {
                count2++;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        if (count1 > Math.floor(n / 3)) {
            result.add(maj1);
        }
        if (count2 > Math.floor(n / 3)) {
            result.add(maj2);
        }
        
        return result;
    }
}