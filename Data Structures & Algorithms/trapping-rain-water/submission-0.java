class Solution {
    public int trap(int[] height) {
      // 0 is position water trapped (no bar)
      // only true if & only if:
      // height[left] > 0; height[right]>0
      // amount water = min(left, right) - height[current]
      int maxLeft = 0; 
      int maxRight = 0;
      int water = 0;
      int left = 0;
      int right = height.length - 1;

      while(left <= right){
        if(height[left] < height[right]){
            if(maxLeft < height[left]){
                maxLeft = height[left++];
            }
            else{
                water += (maxLeft - height[left++]);
            }
        }else{
            if(maxRight < height[right]){
                maxRight = height[right--];
            }else{
                water += (maxRight - height[right--]);
            }
        }
      }
      return water;
    
    }
}
