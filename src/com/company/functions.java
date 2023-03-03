package com.company;
import java.util.*;
public class functions {
//    public static int printSum(int num1, int num2)//Parameter or formal parameters
//    {
//        int sum = num1+num2;
//        System.out.println("Sum is " +sum);
//        return sum;
//    }

    //Find product of a and b
//    public static int multiply(int a, int b){
//        int product = a*b;
//        return product;
//    }

    //Print the factorial of the number n
//    public static int printfact(int n){
//        int f = 1;
//        for(int i = 1;i<=n;i++){
//            f= f*i;
//        }
//
//        return f;
//    }
//
//    //Binomial Factorial
//    public static int binfact(int n , int r){
//        int fact_n = printfact(n);
//        int fact_r = printfact(r);
//        int fact_nmr = printfact(n-r);
//        int bin_fact = fact_n/(fact_nmr*fact_r);
//        return bin_fact;
//    }

    //Prime number
    public static void prime(int n){
        boolean isPrime = true;
        for(int i = 2; i<=n/2;i++){
            if(n%2==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            if(n==1){
                System.out.println("The number is neither prime nor composite");
            }
            else{
                System.out.println("This is a prime number");
            }

        }
        else{
            System.out.println("This is not a prime number");
        }
    }
    public static void main(String[] args) {
        //This code is written by Avni Chauhan
        //DATE: 25/10/22
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of num1");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of num2");
//        int b = sc.nextInt();
//        printSum(a,b);//         Argument or actual parameters
//       int prod = multiply(a,b);
//        System.out.println(prod);
//        System.out.println("Enter the value whose factorial you want to calculate");
//        int n = sc.nextInt();
//        int fact = printfact(n);
//        System.out.println(fact);

        //Binomial Coefficient
//        System.out.println("Enter the value of n");
//        int n = sc.nextInt();
//        System.out.println("Enter the value of r");
//        int r = sc.nextInt();
//        System.out.println(binfact(n,r));

        //Tell if the number is prime or not
        prime(5);

    }


}
