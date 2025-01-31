class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length !=m*n){
            return new int[0][0];
        }
        //initialize the 2d arrays
       int result[][]=new int [m][n];
       int index=0;
       for(int i=0; i<m; i++ ){
        for(int j=0; j<n; j++){
            result[i][j]=original[index];
            index++;
        }
       }
       return result;
        
        
    }
}