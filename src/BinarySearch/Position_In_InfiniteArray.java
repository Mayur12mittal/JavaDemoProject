package BinarySearch;

import java.util.Scanner;

public class Position_In_InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,13,16,18,21};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int elementPosition = positionAns(arr, target);
        System.out.println("Element found at index: "+ elementPosition);
    }

    public static int positionAns(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target>arr[end]){
            int newStart = end+1;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return getElementPosition(arr, target,start,end);
    }

    public static int getElementPosition(int[] arr, int target, int start, int end){
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
