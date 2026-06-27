package Lec8;

public class First_Bad_Version {
    public int firstBadVersion(int n) {
        int l = 0 , r = n, ans = -1;

        while(l <= r){
            int mid = (l + r)/2;
            if(isBadVersion(mid) == false){
                l = mid +1;
            }else{
                ans = mid;
                r = mid -1;
            }
        }
        return ans;
    }
}
