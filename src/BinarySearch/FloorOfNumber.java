package BinarySearch;

import java.util.Scanner;

public class FloorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-2,1,2,4,7,12,14,16,18,22,24};
        System.out.println("Size of array: "+arr.length);
        int target = sc.nextInt();
        int ans = floorOfNumber(arr, target);
        System.out.println("Floor of given target number is: "+ arr[ans]);
    }

    // floor of a number -> means, find greatest(closest) number in an array that is
    // smaller than or equal to target
    public static int floorOfNumber(int[] arr, int target ){
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
        return end;
    }
}
