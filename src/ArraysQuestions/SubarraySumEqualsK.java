package ArraysQuestions;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int k =17;
        int[] arr = {-3,-1,4,6,7,-5,1};
        int start = 0;
        int end = 0;
        int currSum = 0;
        for(int i=0;i<arr.length;i++) {  //O(N^2) time complexity solution
            currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
                if (currSum == k) {
                    start = i;
                    end = j;
                    break;
                }
            }
        }
        System.out.println(start + " " + end);
    }
}
