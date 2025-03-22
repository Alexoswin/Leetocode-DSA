class Solution {
    public int trap(int[] height) {
        

        int[] suf = new int[height.length];

        int max = 0 ;


        for(int i = height.length -1 ; i>= 0 ; i--){
            max = Math.max(max , height[i]);
            suf[i] = max;
        }
        max = 0;
        int water = 0 ;
        for(int i = 0 ; i< height.length ; i++){
            max = Math.max(max , height[i]);
            if(height[i]< max && height[i] < suf[i]){
                water+= Math.min(max, suf[i]) - height[i];
            }
        }

        return water;
    

    }
}