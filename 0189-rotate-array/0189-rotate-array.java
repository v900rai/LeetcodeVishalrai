// class Solution {
//   public void rotate(int[] nums, int k) {
//     if (nums == null || nums.length == 0 || k <= 0) {
//       return;
//     }

//     int n = nums.length;
//     k = k % n; // In case k is greater than the length of the array

//     // Reverse the entire array
//     reverse(nums, 0, n - 1);//while arrays
//     // Reverse the first k elements
//     reverse(nums, 0, k - 1);

//     // Reverse the remaining n - k elements
//     reverse(nums, k, n - 1);

//   }

//   private static void reverse(int[] nums, int start, int end) {
//     while (start < end) {
//       int temp = nums[start];
//       nums[start] = nums[end];
//       nums[end] = temp;
//       start++;
//       end--;
//     }

//   }
// }
class Solution{

public void rotate(int[] nums, int k) {
    // k %= nums.length;
    // reverse(nums, 0, nums.length - 1);
    // reverse(nums, 0, k - 1);
    // reverse(nums, k, nums.length - 1);


    k=k%nums.length;
    reverse(nums, 0 ,nums.length-1);
    reverse(nums,0,k-1);
    reverse(nums, k, nums.length-1);
}

private void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start++] = nums[end];
        nums[end--] = temp;
    }
}
}