package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class F_L_Pos_Diff_Approach {
    public static void main(String[] args) {

        //This approach works in O(N) time complexity
        //Bcoz we are using linear search

        int[] arr = {3,7,7,7,8,8,9};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] res = {-1,-1};

        //search for first occurrence from start
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                res[0] = i;
                break;
            }
        }
        //search for first occurrence from back
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j]==target){
                res[1] = j;
                break;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
