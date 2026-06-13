package Lec2;

import java.util.Scanner;

public class Inverse_Of_Numb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // sol
        int inv_ans = 0;// 154
        int op = 1;
        while (n != 0){
            //work
            int od = n%10;// 21453 %10  -> 3// 5
            int id = op;
            int ip = od;

            inv_ans = inv_ans + id * (int)Math.pow(10 , ip - 1);// -> double
          // 54 + 100
            n = n/10;// quoitent// 2145//214
            op++;

        }
        System.out.println(inv_ans);

    }
}
