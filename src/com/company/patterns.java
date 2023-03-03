package com.company;

public class patterns {
    public static void main(String[] args) {

        //Patterns Question
        //1. Solid Rectangle
//        for(int i = 1;i<=4;i++){
//            for(int j =1;j<=5;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //2.half rectangle
//        for(int i = 1;i<=4;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //3.Inverted half rectangle
//        for(int i = 4;i>=1;i--){
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //4.half rectangle with numbers

//        for(int i = 1;i<=5;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print(j +" ");
//            }
//            System.out.println();
//        }

        //5.Half pyramid with characters
//        char ch = 'A';
//        for(int i = 1;i<=5;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print(ch +" ");
//                ch++;
//            }
//            System.out.println();
//        }

        //6.Hollow rectangle
//        for(int i = 1;i<=4;i++){
//            for(int j = 1; j<=5;j++){
//                if(i==1 || j==1 ||i==4||j==5){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //7.Inverted and rotated half rectangle
//        for(int i = 1;i<=4;i++){
//            //for spaces
//            for(int j = 1;j<=4-i;j++){
//                System.out.print(" ");
//            }
//            //for stars
//            for(int j =1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        //8. Inverted half pyramid with numbers
//        for(int i = 5;i>=1;i--){
//            for(int j = 1;j<=i;j++){
//                System.out.print(j +" ");
//            }
//            System.out.println();
//        }

        //9.Floyd's Triangle
//        int number = 1;
//        for(int i = 1;i<=5; i++){
//            for(int j = 1 ; j<=i ;j++){
//                System.out.print(number +" ");
//                number++;
//            }
//            System.out.println();
//        }

        //10. 0-1 Triangle
//        for(int i = 1;i<=5;i++){
//            for(int j =1; j<= i;j++){
//                int sum = i+j;
//                if(sum%2==0){
//                    System.out.print("1 ");
//                }
//                else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }

        //11.Butterfly Pattern

        //first half
//        for (int i = 1; i <= 4; i++) {
//            //for stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            //for spaces
//            for (int j = 1; j <= 2 * (4 - i); j++) {
//                System.out.print(" ");
//            }
//            //for stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //Second half
//        for (int i = 4; i >= 1; i--) {
//            //for stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            //for spaces
//            for (int j = 1; j <= 2 * (4 - i); j++) {
//                System.out.print(" ");
//            }
//            //for stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //12.Solid rhombus
//        for(int i = 1;i<=5;i++){
//            //for spaces
//            for(int j = 1;j<=5-i;j++){
//                System.out.print(" ");
//            }
//            //for stars
//            for(int j = 1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //13.Hollow Rectangle
//        int n =5;
//        for(int i = 1;i<=n;i++){
//            //spaces
//            for(int j = 1; j<= n-i;j++){
//                System.out.print(" ");
//            }
//            //for hollow rhombus we will apply the same logic of hollow rectangle
//            for(int j = 1;j<=n;j++){
//                if(i==1 || j==1 || i==n ||j==n){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //14.Pyramid
//        int n =5;
//        for(int i = 1;i<=n;i++){
//            //spaces
//            for(int j = 1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            //numbers
//            for(int j = 1;j<=i;j++){
//                System.out.print(i +" ");
//            }
//            System.out.println();
//        }

        //15.pyramid with palindrome effect
//        int n = 5;
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = i;j>=1;j--){
//                System.out.print(j);
//            }
//            for(int j = 2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //Diamond pattern
        int n =5;
        for(int i = 1;i<=n;i++){
            //spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Second half
        for(int i =n;i>=1;i--)
        {
            //spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
