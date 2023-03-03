package com.company;

public class patterns2 {
    public static void main(String[] args) {

        // 1. Square pattern
//        for(int i = 0 ; i <4;i++) {
//            for (int j = 0; j <= 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
            //2.half triangle
//        for(int i = 0;i<=4;i++){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //3. Inverted star pattern
//        int n =4;
//        for(int i = 4;i>=1;i--){
//            for(int j = 1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //4. Print half pyramid with number
//        int n = 4;
//        for(int i =1;i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //5. Print characters in half pyramind
//        char ch = 'A';
//        for(int i = 1; i <=4;i++){
//            for(int j = 1; j<=i;j++){
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }

        //6. Hollow Rectangle
//        for(int i = 1 ; i <=4;i++){
//            for(int j = 1; j<=5;j++){
//                if(i==1 || j == 1 || i==4 ||j==5){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //Inverted and rotated half pyramid
//        for(int i = 1;i<=4;i++){
//            for(int j = 1;j<=4-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Rotated and half pyramid with numbers
//        for(int i = 5;i>=1;i--){
//            for(int j = 1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //Floyd's Triangle
//        int num = 1;
//        for(int i = 1; i <=5;i++){
//            for(int j = 1; j<=i;j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }

        //0-1 Triangle
//        for(int i = 1 ; i <=5;i++){
//            for(int j = 1;j<=i;j++){
//                if((i+j)%2==0){
//                    System.out.print("1");
//                }
//                else{
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }

//        //Butterfly pattern
//        int n = 4;
//        //First half
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j = 1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //Second half
//        for(int i=n;i>=1;i--){
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j = 1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        //Solid Rhombus
//        for(int i = 1;i<=5;i++){
//            for(int j = 1;j<=5-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Hollow Rhombus
//        for(int i = 1;i<=5;i++){
//            for(int j =1;j<=5-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=5;j++){
//                if(i==1||j==1||i==5||j==5){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //Diamond Pattern
//        for(int i = 1;i<=4;i++) {
//            for(int j = 1;j<=4-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=(2*i)-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = 4;i>=1;i--){
//            for(int j = 1;j<=4-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=(2*i)-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Number Pyramid
//        for(int i = 1 ; i <=5;i++){
//            for(int j =1;j<=5-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=i;j++){
//                System.out.print(i +" ");
//            }
//            System.out.println();
//        }

        //Palindrome pyramid
        for(int i = 1; i <=5;i++){
            //spaces
            for(int j = 1;j<=5-i;j++){
                System.out.print(" ");
            }
            //Half Pyramid
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            //Second half
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
