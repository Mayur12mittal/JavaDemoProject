package ArraysQuestions;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args){
        int[] arr = {2,4,3,5,7,1};
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int temp;
        while(start<end){
           temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}
