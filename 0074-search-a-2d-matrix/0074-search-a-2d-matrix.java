class Solution {
    public boolean searchMatrix(int[][] arr, int x) {
         int m = arr.length;
         int  n = arr[0].length;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[i][j] == x)
          return true;
      }
    }
    return false;
  }
        
    
}