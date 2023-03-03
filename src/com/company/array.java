package com.company;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class array {
//    public static void updateArray(int marks[] ){
//        for(int i =0;i<marks.length;i++){
//            marks[i] += 1;
//        }
//        public static int binarySearch(int num[], int key){
//            int start = 0 ; int end = num.length-1;
//            while(start<=end){
//                int mid = (start+end)/2;
//                if(num[mid]==key){
//                    return mid;
//                }
//                else if(num[mid]<key){
//                    start = mid+1;
//            }
//                else{
//                    end = mid - 1;
//                }
//            }
//            return -1;
//    }

//    public static void reverseArray(int num[]){
//        int first = 0;
//        int last = num.length-1;
//        while(first<last) {
//            int temp = num[first];
//            num[first] = num[last];
//            num[last] = temp;
//            first++;
//            last--;
//        }
//    }
//    public static void main(String[] args) {
        //This code is written by Avni Chauhan
        //DATE: 09/11/23
        //Updating an array
//        int marks[] = {22,32,42};
//        updateArray(marks);
//
//        //Printing the updated array now
//        for(int i = 0 ; i< marks.length;i++){
//            System.out.println(marks[i]);
//        }

        //Linear Search
        //Q1. Find the index of element in the given array
//        int num[] = {2,4,6,8,10,12};
//        int key = 8;
//        for(int i = 0; i < num.length;i++){
//            if(num[i]==key){
//                System.out.println(i);
//            }
//        }
//        //Time complexity: O(n)

        //Q2.Largest number in the given array
//        int largest = Integer.MIN_VALUE;
//        for(int i = 0;i< num.length;i++){
//            if(largest<num[i]){
//                largest=num[i];
//            }
//        }
//        System.out.println(largest);
//        //Time Complexity: O(n)

        //Q3. Binary Search
//        int key = 10;
//        int ans = binarySearch(num , key);
//        System.out.println(ans);

        //Q4.Reverse of an array
//        int num[] = {2,4,6,8,10,12};
//        reverseArray(num);
//        for(int i = 0 ; i < num.length;i++){
//            System.out.print(num[i]+" ");
//        }

        //Q5. Pairs in an array
//        int num[] = { 2,4,6,8,10};
//        for(int i = 0 ; i < num.length;i++){
//            int curr = num[i];
//            for(int j = i + 1; j< num.length;j++){
//                System.out.print("("+curr+","+num[j]+")");
//            }
//            System.out.println();
//        }

        //Q6. Printing the subarrays
//        int num[] = {2,3,4,5,6,7,8};
//        int tp = 0;
//        for(int i = 0 ; i < num.length;i++){
//            int start = i;
//            for(int j = i ; j < num.length;j++){
//                int end = j;
//                for(int k = start;k<=end;k++){
//                    System.out.print(num[k]+" ");
//                }
//                System.out.println();
//                tp++;
//            }
//            System.out.println();
//        }
//        System.out.println("Total number of subarrays: "+tp);

        //Q7.Max Subarray sum

//       int maxSum = Integer.MIN_VALUE;
//       int num[] = {2,4,6,8,10};
//       for(int i = 0 ; i < num.length;i++){
//           int start = i ;
//           for(int j = i;j< num.length;j++){
//               int end = j;
//               int currSum = 0;
//               for(int k = start; k<=end;k++) {
//                   currSum += num[k];
//               }
//                   if(maxSum<currSum) {
//                   maxSum = currSum;
//                   }
//           }
//       }
//        System.out.println(maxSum);

        //Kadanes Algorithm to find max sum of a subarray
//        int num[] = {-2,-3,4,-1,-2,1,5,-3};
//        int ms = Integer.MIN_VALUE;
//        int cs = 0;
//        for(int i = 0 ; i < num.length;i++){
//            cs = cs+num[i];
//            if(cs<0){
//                cs = 0;
//            }
//            ms = Math.max(cs,ms);
//        }
//        System.out.println(ms);

        //Q9. Trapping Rainwater Problem
//    public static int trappingRainwater(int height[]){
//        //calculating the left max
//        int leftmax[] = new int[height.length];
//        leftmax[0] = height[0];
//        for(int i = 1; i< height.length;i++){
//            leftmax[i] = Math.max(height[i],height[i-1]);
//        }
//        //calculating the right max
//        int rightmax[] = new int[height.length];
//        rightmax[height.length-1] = height[height.length-1];
//        for(int i = height.length-2;i>=0;i--){
//            rightmax[i] = Math.max(height[i],rightmax[i+1]);
//        }
//        //loop for calculating trappedwater
//        int trappedwater = 0;
//        for(int i = 0 ; i< height.length;i++){
//            int waterlevel = Math.min(leftmax[i],rightmax[i]);
//            trappedwater += waterlevel - height[i];
//        }
//        return trappedwater;
//    }
//        public static void main(String[] args) {
//            int height[] = { 4,2,0,6,3,2,5};
//            System.out.println(trappingRainwater(height));
//        }
        //Q10. Stock buy and sell
        public static int stocks(int prices[]){
             int buyprice = Integer.MAX_VALUE;
             int maxprofit = 0;
             for(int i = 0 ; i <prices.length;i++){
                 if(buyprice<prices[i]){
                     int profit = prices[i] - buyprice;
                     maxprofit = Math.max(maxprofit,profit);
                 }
                 else{
                     buyprice = prices[i];
                 }
             }
             return maxprofit;
        }
        public static void main(String[] args) {
            int prices[] = {7,1,5,3,6,4};
            System.out.println(stocks(prices));
        }

    }

