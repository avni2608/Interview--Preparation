package com.company;
import java.util.Arrays;
import java.util.Collections;
public class sorting {
//    public static void bubbleSort(int arr[]){
//        int swaps = 0;
//        for(int i = 0; i < arr.length-1;i++){
//
//            for(int j = 0; j < arr.length - i - 1;j++){
//
//                if(arr[j]>arr[j+1]){
//                    //Swapping
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    swaps++;
//                }
//            }
//        }
//        System.out.println("No. of swaps are:"+swaps);
//    }
    public static void printArr(int arr[]){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
   }

    //Selection Sort

//    public static void selectionSort(int arr[]){
//        for(int i = 0 ; i< arr.length-1;i++){
//            int smallest = i;
//            for(int j = i+1;j< arr.length;j++) {
//                if (arr[smallest] > arr[j]) {
//                    smallest = j;
//                }
//            }
//                //swap
//                int temp = arr[smallest];
//                arr[smallest] = arr[i];
//                arr[i] = temp;
//
//        }


    //Insertion Sort
//    public static void insertionSort(int arr[]){
//        for(int i = 1 ; i< arr.length;i++){
//            int current = arr[i];
//            int prev = i-1;
//            //finding out the correct position to insert
//            while(prev>=0 && arr[prev]>current){
//                arr[prev +1] = arr[prev];
//                prev--;
//            }
//            arr[prev+1] = current;
//        }
//    }

//    }

    //Count Sort

    public static void countSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }

        //Counting the frequency
        int count[] = new int[largest+1];
        for(int i = 0 ; i < arr.length;i++){
            count[arr[i]]++;
        }
        //Sorting the array now
        int j = 0;
        for(int i = 0 ; i < count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
       // int arr[] = {8,7,5,4,6};
//        bubbleSort(arr);

          //selectionSort(arr);
        //insertionSort(arr);

        //Inbuilt sort
//        Arrays.sort(arr);
//        printArr(arr);
//        Integer arr[] = {9,6,4,2,7};
//          Arrays.sort(arr,Collections.reverseOrder());

        int arr[] = {7,5,4,9,3};
        countSort(arr);
        printArr(arr);

    }
}
