package Lec9;

public class Bubble_Sort {

    public static boolean isSmaller(int[] nums , int a , int b){
        if(nums[a] < nums[b])return true;
        return false;
    }
    public static void swap(int[] nums , int a , int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void bubbleSort(int[] nums){
        for (int itr = 1; itr <= nums.length-1;itr++){
            for (int j = 0;j < nums.length - itr;j++){
                if (isSmaller(nums , j + 1 , j)){
                    swap(nums , j + 1 , j);
                }
            }
        }
    }

    // best case -> o(n)
    // worst case -> o(n^2)




    public static void selectionSort(int[] nums){
        for (int i = 0;i < nums.length-1;i++){
            int min = i;
            for (int j = i + 1;j < nums.length;j++){
                if (isSmaller((nums , j , min))){
                    min = j;
                }
            }
            swap(nums , i , min);
        }
    }

    public static void insertionSort(int[] nums){
        for (int i = 1;i < nums.length;i++){
            for (int j= i -1; j>= 0;j--){
                if (isGreater(nums , j , j + 1)){
                    swap(nums , j ,j + 1);
                }else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args){

    }
}
