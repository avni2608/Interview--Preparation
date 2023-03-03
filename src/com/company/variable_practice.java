package com.company;
import java.util.*;
public class variable_practice {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);

        //Q1. Average of three numbers
//        System.out.println("Enter the value of all three numbers");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int avg = (a+b+c)/3;
//        System.out.println("Average of three numbers is: "+avg);

        //Q2. Area of square
//        System.out.println("Enter the side of square");
//        int side = sc. nextInt();
//        int area = side*side;
//        System.out.println("Area of the square is:"+area);

        //Q3. Stationary bill
//        System.out.println("Enter the cost of pen");
//        int pen = sc.nextInt();
//        System.out.println("Enter the cost of pencil");
//        int pencil = sc.nextInt();
//        System.out.println("Enter the cost of notebook");
//        int nb = sc.nextInt();
//        int bill = (pen+pencil+nb);
//        int fin_bill = bill + (18/100)*bill;
//        System.out.println("Your final bill including 18% gst is: "+fin_bill);

        //Conditionals
//        int num = 4;
//        String even = (num%2==0)?"even":"odd";
//        System.out.println(even);

        ///Positive - Negative
//        int num = 9;
//        if(num<0){
//            System.out.println("Positive number");
//        }
//        else if(num>0){
//            System.out.println("Negative number");
//        }
//        else{
//            System.out.println("The number is 0");
//        }

        //Temperature checking
//        double temp = 103.6;
//        if(temp<100){
//            System.out.println("You don't have figure");
//        }
//        else{
//            System.out.println("You are having figure");
//        }

        //Calender
//        int day = 1;
//        switch(day){
//            case 1: {
//                System.out.println("Monday");
//                break;
//            }
//            case 2:{
//                System.out.println("Tuesday");
//                break;
//            }
//            case 3:{
//                System.out.println("Wednesday");
//                break;
//            }
//            case 4:{
//                System.out.println("Thursday");
//                break;
//            }
//            case 5:{
//                System.out.println("Friday");
//                break;
//            }
//            case 6:{
//                System.out.println("Saturday");
//                break;
//            }
//            case 7:{
//                System.out.println("Sunday");
//                break;
//            }
//            default:{
//                System.out.println("Invalid entry");
//            }
//
//        }

        //Checking the leap year
//        System.out.println("Enter the year");
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if(year%2==0 && (year%100!=0 || year%400==0)){
//            System.out.println("leap year");
//        }
//        else{
//            System.out.println("Not a leap year");
//        }

        //Loops
        //Sum of first n natural numbers
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n");
//        int num = sc.nextInt();
//        int sum = 0;
//        int i = 1;
//        while(i<=num){
//            sum += i;
//            i++;
//        }
//        System.out.println("Sum is: "+sum);

        //Print reverse of a number
//        int num = 260802;
//        while(num>0){
//            int lastdigit = num%10;
//            System.out.print(lastdigit+" ");
//            num = num/10;
//        }

        //Keep entering numbers until user enters multiple of 10
//        Scanner sc = new Scanner(System.in);
//        do{
//            System.out.println("Enter the number");
//            int num = sc.nextInt();
//            if(num%10==0){
//                break;
//            }
//            System.out.println(num);
//        }while(true);

        //Check if a number is prime or not
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i < n/2;i++){
            if(n%i==0){
                isPrime = true;
                break;
            }
        }
        if(isPrime){
            if(n==1){
                System.out.println("The number is neither prime nor composite");
            }
            else{
                System.out.println("The number is prime");
            }

        }
        else
        {
            System.out.println("The number is not a prime number");
        }
    }
}
