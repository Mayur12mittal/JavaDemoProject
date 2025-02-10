package ArraysQuestions;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        //sorted array
        int[] arr = {1,1,2,3,3,4,5,5,7,8,9,9}; //unique - 1 2 3 4 5 7 8 9
        int k=0;
        System.out.println(arr.length);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                continue;
            }
            else{
                arr[k] = arr[i];
                k++;
            }
        }
        arr[k] = arr[arr.length-1];
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<=k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
