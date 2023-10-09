package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,1,88,65,3};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] nums , int low,int hi){
        if(low>=hi){
            return;
        }
        int s=low;
        int e = hi;
        int m= s+(e-s)/2;
        int pivot = nums[m];

        while(s<=e){
//            this ensures that if array is sorted no more need of recursion

            while(nums[s] < pivot){
                s++;

            }
            while(nums[e] > pivot){
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] =temp;
                s++;
                e--;
            }

        }
        //            Now pivot is at its correct  position
        sort(nums,low,e);
        sort(nums,s,hi);

    }
}
