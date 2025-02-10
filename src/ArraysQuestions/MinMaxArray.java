package ArraysQuestions;

import java.util.Arrays;

public class MinMaxArray {
    public static void getMinMax(int[] arr){
        Arrays.sort(arr);
        int length = arr.length;
        System.out.println("Max element in array is -> " + arr[length-1]);
        System.out.println("Min element in array is -> " + arr[0]);
    }

    public static void getMinMaxWithoutSort(int[] arr){
        int n = arr.length;
        int min;
        int max;
        if(arr[0]>arr[1]){
            max = arr[0];
            min = arr[1];
        } else{
            max = arr[1];
            min = arr[0];
        }

        for(int i=2;i<n;i++){
            if(arr[i]<min)
            {
                min = arr[i];
            } else if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println("Min element in array is -> " + min);
        System.out.println("Max element in array is -> " + max);
    }

    public static void main(String[] args){
        int[] arr = {2,1,7,3,9,8};
        //getMinMax(arr);
        getMinMaxWithoutSort(arr);
    }
}
