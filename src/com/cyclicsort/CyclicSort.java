package com.selectionsort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr= {4,5,1,2,3};
        cyclisort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclisort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct= arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}
