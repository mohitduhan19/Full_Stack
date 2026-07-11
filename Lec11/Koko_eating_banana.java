package Lec11;

public class Koko_eating_banana {
    public boolean isPossible(int[] piles , int speed , int maxhr){
        long currhr = 0;
        for(int banana: piles){
            currhr = currhr + banana/speed;
            if(banana % speed != 0)currhr++;
        }
        if(currhr <= maxhr)return true;
        return false;
    }
    public int max(int[] arr){
        int ans = 0;
        for(int i= 0;i < arr.length;i++){
            ans = Math.max(ans , arr[i]);
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1 ,high = max(piles);
        int ans = high;
        while(l <= high){
            int midSpeed = l + (high - l) / 2;

            if(isPossible(piles ,midSpeed , h) == true){
                ans = midSpeed;
                high = midSpeed -1;
            }else{
                l = midSpeed +1;
            }
        }
        return ans;
    }
}
