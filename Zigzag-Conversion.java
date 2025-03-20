class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        
        StringBuilder sb = new StringBuilder();

 int jump = (numRows - 1) * 2;
        for(int i = 0 ; i< numRows ; i++){
           
            for(int j = i ; j< s.length(); j+=jump){

                    sb.append(s.charAt(j));

               int nextJump = j + jump - 2 * i;
                

                if( i!= 0 && i != numRows-1 && nextJump < s.length()){
                    sb.append(s.charAt(nextJump));
                }
            }
        }


        return sb.toString();
    }
}