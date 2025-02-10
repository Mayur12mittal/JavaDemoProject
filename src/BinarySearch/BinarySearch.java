package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {-2,1,2,4,7,12,14,16,18,22,24};
        System.out.println("Size of array: "+arr.length);
        //in binary search, we have to find target in given array
        int target = sc.nextInt();
        int ans = binarySearch(arr, target);
        if(ans == -1){
            System.out.println("Element not found in array");
        }else {
            System.out.println("Element found at index: "+ans);
        }
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else {
                if(target>arr[mid]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
