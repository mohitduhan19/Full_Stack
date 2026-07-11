package Lec11;

public class Allocation_Books {
    public static boolean isPossible(int[] pages , int limit , int total_st){
        int st = 1 ,currpage=0;

        for(int i = 0;i < pages.length;i++){
            if(currpage + pages[i] <= limit){
                currpage += pages[i];
            }else{
                st++;
                currpage = pages[i];
            }
        }

        return st <= total_st;

    }
    public static int max(int[] pages){
        int ans = 0;
        for(int i =0;i < pages.length;i++){
            ans = Math.max(ans , pages[i]);
        }
        return ans;
    }
    public static int sum(int[] pages){
        int ans = 0;
        for(int i = 0;i < pages.length;i++){
            ans += pages[i];
        }
        return ans;
    }
    public static int findPages(int[] pages, int st) {
        // code here
        if(st > pages.length)return -1;
        int l = max(pages) , h = sum(pages);

        int ans = 0;

        while(l <= h){
            int mid= (l + h)/2;
            if(isPossible(pages , mid , st) == true){
                ans = mid;
                h = mid -1;
            }else{
                l = mid +1;
            }
        }
        return ans;
    }
}
