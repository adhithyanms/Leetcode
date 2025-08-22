class Solution {
    public int countTriples(int n) {
      int count=0;
      for(int a=1;a<=n;a++){
        for(int b=1;b<=n;b++){
            int cSquare=(a*a)+(b*b);
            int c=(int)Math.sqrt(cSquare);
            if(c*c==cSquare && c<=n){
                count++;
            }
        }
      }  
      return count;
    }
}