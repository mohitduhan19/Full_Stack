package Lec8;
import java.util.*;
public class Heaters {
    class pair{
        int js = -1;
        int jl = -1;
        pair(){};
        pair(int js , int jl){
            this.js = js;
            this.jl = jl;
        }
    }
    public pair binarySearch(int tar , int [] nums){
        int l = 0 , r = nums.length -1;
        pair p = new pair();

        while(l <= r){
            int mid = l + (r-l)/2;

            if(nums[mid] == tar){
                p.js = nums[mid];
                p.jl = nums[mid];
                break;
            }else if(nums[mid] < tar){
                p.js = nums[mid];
                l = mid + 1;
            }else{
                p.jl = nums[mid];
                r = mid - 1;
            }
        }
        return p;
    }
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int ans = 0;

        for(int i = 0;i < houses.length;i++){
            int hp = houses[i];

            pair p = binarySearch(hp , heaters);

            int d1 = (p.js == -1) ? Integer.MAX_VALUE : Math.abs(hp - p.js);
            int d2 = (p.jl == -1) ? Integer.MAX_VALUE : Math.abs(p.jl - hp);
            int mind = Math.min(d1 , d2);

            if(mind > ans)ans = mind;
        }


        return ans;
    }
}
