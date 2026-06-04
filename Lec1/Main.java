package Lec1;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        // numner n
//       // int n = 5;
//        int n = sc.nextInt();
//       // double t = sc.nextDouble();
//       int n1 = 10;
//       System.out.println(n1);
//
//        int t = sc.nextInt();
//        for(int i = 0;i < t;i++){// inputs 10 ^4
//            int n = sc.nextInt();// 5, 6
//
//            int count = 0;
//            for(int div = 1; div <= n;div++){// 10 ^9
//                if(n % div == 0){// 8% 1 , 8 % 2 , 8 % 3
//                    count++;// 0 1 2
//                }
//            }
//            if(count == 2){
//                System.out.println("prime");
//            }else{
//                System.out.println("not prime");
//            }
//        }

    // 2nd approach
        int t = sc.nextInt();
        for(int i = 0;i < t;i++){// inputs 10 ^4
            int n = sc.nextInt();// 5, 6

            int count = 0;
            for(int div = 2; div *div <= n;div++){// 10 ^9
                if(n % div == 0){// 8% 1 , 8 % 2 , 8 % 3
                    count++;// 0 1 2
                }
            }
            if(count == 0){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }

    }
}