package ArraysQuestions;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void mergeArray(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] res = new int[n1+n2];
        int i = 0,j = 0,k = 0;
        while(i < n1){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
                k++;
            }
            else {
                res[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(j<n2){
            res[k]=arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,5,6,7};
        int[] arr2 = {3,4,8,9};
        mergeArray(arr1,arr2);
    }
}
