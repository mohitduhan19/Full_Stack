package Lec12;

public class Aggressive_Cows {
    public boolean isPossible(int[] stalls , int cdist , int tcows){
        int currCows = 1 , last = stalls[0];

        for(int i = 1;i < stalls.length;i++){
            if(stalls[i] - last >= cdist){
                currCows++;
                last = stalls[i];
            }
            if(currCows >= tcows)return true;
        }
        return false;
    }
    public int aggressiveCows(int[] stalls, int cows) {
        // code here
        Arrays.sort(stalls);
        int l = 1 , h = stalls[stalls.length - 1] - stalls[0];

        while(l <= h){
            int cdist = l + (h -l)/2;

            if(isPossible(stalls , cdist , cows)){
                l =  cdist +1;
            }else{
                h = cdist -1;
            }
        }
        return h;
    }
}
