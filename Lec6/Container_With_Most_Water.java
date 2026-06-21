package Lec6;

public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int l =  0 , r =  height.length-1;
        int area =0;

        while(l < r){
            int width = r-l;
            int ht = Math.min(height[l] , height[r]);
            area = Math.max(area , width *ht);
            if(height[l] <= height[r])l++;
            else r--;
        }
        return area;
    }
}
