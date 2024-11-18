package com.task82;

import java.util.Arrays;

public class ArrayOperations {
    public double[] arr;
    public ArrayOperations(double[] arr){
        this.arr = arr;
    }

    public class Statistics{
        public double mean(double[] arr){
            double sum =0;
            for(int i =0;i<arr.length;i++){
                sum+=arr[i];
            }
            return sum/arr.length;
        }
    }

//    public static void main(String[] args) {
//        double[] arr = {1.0,2,3,5,6,9};
//        ArrayOperations a = new ArrayOperations(arr);
//        System.out.println(Statistics.mean(a.arr));
//    }
}
