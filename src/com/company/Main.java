package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //This code is written by Avni Chauhan
//        int a = 10;
//        int b = 20;
//        int sum = a+b;
//        System.out.println(sum);
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println(name);
//        String fullname = sc.nextLine();
//        System.out.println(fullname);
//        int n = 4;
//        for(int i = 1;i<=n;i++){
//            //for stars
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j=1; j<=(2*(n-i));j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //Second half
//        for(int i =n; i>=1;i--){
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j=1; j<=(2*(n-i));j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

        //Reverse the given number - print
//        int n = 260802;
//        while(n>0){
//            int lastdigit = n%10;
//            System.out.print(lastdigit+ " ");
//            n = n /10;
//        }

//        //Reverse the number itself
//        int n = 987655;
//        int rev =0;
//        while(n>0){
//            int lastdigit = n%10;
//            rev = (rev*10) + lastdigit;
//            n = n/10;
//        }
//        System.out.println(rev);

        //Check if the number is prime or not
        int n =10;
        boolean isPrime = true;
        for(int i = 2; i<=n/2;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            if(n==1){
                System.out.println("This is neither prime nor composite");
            }
            else{
                System.out.println("This is a prime number");
            }
        }
        else
        {
            System.out.println("This is not a prime number");
        }

    }
}
