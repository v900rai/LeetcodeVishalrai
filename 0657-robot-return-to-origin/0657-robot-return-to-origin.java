class Solution {
    public boolean judgeCircle(String moves) {
      int x=0;
      int y=0;

      for(char ch :moves.toCharArray()){
        if(ch == 'R')
        x++;
        else if(ch == 'L')
        x--;

        else if(ch == 'U')
        y++;

        else 
        y--;
      }
      return x==0 && y ==0;
        
    }
}