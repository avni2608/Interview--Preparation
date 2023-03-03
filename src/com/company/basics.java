package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class basics {
    public static void main(String[] args) {


        //Product of a and b
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = a * b;
//        System.out.println(sum);

        //Type promotion in expression
//        char a = 'a';
//        char b = 'b';
//        System.out.println((int)(a));
//        System.out.println((int)(b));
//        System.out.println(b-a);

//        int a =5;
//        float b = 88.90f;
//        long c = 55;
//        double d = 99;
//        double sum = a+b+c+d;
//        System.out.println(sum);//Everything will be converted in double

//        float a = 99.99f;
//        int b = (int)(a);
//        System.out.println(b);

//        char ch = 'A';
//        char ch2 = 'B';
//        int number = ch;
//        int number2 = ch2;
//        System.out.println(number);
//        System.out.println(number2);

        //PostIncrement Operator
//        int a= 10;
//        int b = ++a;
//        System.out.println(a);
//        System.out.println(b);
//
//        //PreIncrement Operator
//        int c = 10;
//        int d = a++;
//        System.out.println(c);
//        System.out.println(d);

        //ODD OR EVEN
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        if(number%2==0){
//            System.out.println("Even Number");
//        }
//        else{
//            System.out.println("Odd number");
//        }

        //Income Tax Calculator
//        Scanner sc = new Scanner(System.in);
//        int income = sc.nextInt();
//        int tax;
//        if(income<500000){
//            System.out.println("No Tax");
//            tax = 0;
//        }
//        else if(income>500000 && income<1000000){
//            tax = (int)(income*0.2);
//        }
//        else{
//            tax =(int)(income*0.3);
//        }
//        System.out.println("Your Tax is: " +tax);


        //Print the largest of three
//        int a, b, c;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of a");
//        a = sc.nextInt();
//        System.out.println("Enter the value of b");
//        b = sc.nextInt();
//        System.out.println("Enter the value of c");
//        c = sc.nextInt();
//        if (a > b) {
//            if (a > c) {
//                System.out.println("A is greatest");
//            } else {
//                System.out.println("b is greatest");
//            }
//        } else {
//            System.out.println("c is greatest");
//        }

//        //Ternary Operator
//        int number = 5;
//        String type=  (number%2==0)? "even":"odd";
//        System.out.println(type);

        //Switch case
//        int number = 2;
//        switch(number){
//            case 1: {
//                System.out.println("Mango Shake");
//                break;
//            }
//            case 2:
//            {
//                System.out.println("Momo");
//                break;
//            }
//            case 3:
//            {
//
//                break;
//            }
//            default:
//            {
//                System.out.println("we wake up");
//            }
//        }

        //Calculator using switch
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        char operator = sc.next().charAt(0);
//        switch(operator){
//            case '+':{
//                System.out.println(a+b);
//                break;
//            }
//            case '-':{
//                System.out.println(a-b);
//                break;
//            }
//            case '*':{
//                System.out.println(a*b);
//                break;
//            }
//            case '/':{
//                System.out.println(a/b);
//                break;
//            }
//            case '%':{
//                System.out.println(a%b);
//                break;
//            }
//        default:{
//            System.out.println("Invalid entry");
//        }
//        }

        //While loop
//        int number = 1;
//        while(number<=4){
//            System.out.println("Hello World");
//            number++;
//        }

        //Print 1 to n
     Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int counter = 1;
//        while(counter<=n){
//            System.out.println(counter +" ");
//            counter++;
//
//        }

        //Print number from 1 to 10
//        int counter = 1;
//        while(counter<=10){
//            System.out.println(counter);
//            counter ++;
//        }

        // for loop

//        for(int i = 0; i<4;i++){
//            System.out.println("Hello world");
//        }

        //Square pattern

//        for(int i = 1; i<=4;i++){
//            for(int j = 1;j<=4;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Print sum of first n natural numbers
//        int sum = 0;
//        for(int i = 1;i<=10;i++){
//            sum += i;
//        }
//        System.out.println(sum);

        //Break Statement
//        for(int i = 1; i<=5;i++){
//            if(i==3){
//                break;
//
//            }
//            System.out.println(i);
//        }
//        System.out.println("I am out of the loop");


        //Keep entering the number till user enters a multiple of 10
//        do{
//            System.out.println("Enter your number");
//            int n = sc.nextInt();
//            if(n%10==0){
//                break;
//            }
//            System.out.println(n);
//        }while(true);

        //Print the reverse of a number

//        int n = 260802;
//
//       while(n>0){
//           int lastdigit = n%10;
//           System.out.print(lastdigit + " ");
//           n = n/10;
//       }

        //Reverse the given number
//        int n = 202089;
//        int rev = 0;
//
//        while(n>0){
//            int lastdigit = n%10;
//            rev = (rev*10) + lastdigit;
//            n = n / 10;
//        }
//        System.out.println(rev);

        //Display all numbers entered by the user who are multiple of 10
//        do{
//            System.out.println("Enter your number");
//            int num = sc.nextInt();
//
//            if(num%10==0){
//                continue;
//            }
//            System.out.println(num);
//        }while(true);

        //Check if the number is prime or not
        System.out.println("Enter any number");
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2;i<=num/2;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            if(num==1){
                System.out.println("The number is neither prime nor composite");
            }
            else{
                System.out.println("It is a prime number");
            }
        }
        else{
            System.out.println("This is not a prime number");
        }



    }
}