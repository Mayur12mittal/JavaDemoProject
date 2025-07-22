package ArraysQuestions;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {8,-1,4,6,7,-5,0};
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int start = 0;
        int end = 0;
        for(int i=0;i<arr.length;i++){
            currSum = currSum+arr[i];
            if(currSum<0){
                currSum = 0;
                start = i+1; //update start index of subarray
            }
            maxSum = Math.max(currSum, maxSum);
            if(currSum>=maxSum){
                end = i; //update end index of subarray
            }
        }
        System.out.println(maxSum);
        System.out.println(start + " " + end );

        for(int i=start; i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
