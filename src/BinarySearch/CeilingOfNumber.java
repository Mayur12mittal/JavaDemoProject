package BinarySearch;

import java.util.Scanner;

public class CeilingOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-2,1,2,4,7,12,14,16,18,22,24};
        System.out.println("Size of array: "+arr.length);
        int target = sc.nextInt();
        int ans = ceilingOfNumber(arr, target);
        System.out.println("Ceiling of given target number is: "+ arr[ans]);
    }
    // ceiling of a number -> means, find smallest(closest) number in an array that is
    // greater than or equal to target
    public static int ceilingOfNumber(int[] arr, int target){
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
        return start;
    }
}
