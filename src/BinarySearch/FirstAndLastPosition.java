package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPosition {
    public static void main(String[] args) {

        //This approach works in O(logN) time complexity
        //Bcoz we are using binary search

        int[] nums = {1,3,7,7,7,8,8,10};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] positions = findPosition(nums,target);
        System.out.println(Arrays.toString(positions));
    }

    public static int[] findPosition(int[] nums, int target){
        int[] ans = {-1,-1};
        ans[0] = searchElement(nums,target,true);
        if(ans[0] != -1){
            ans[1] = searchElement(nums,target,false);
        }
        return ans;
    }

    public static int searchElement(int[] nums, int target, boolean searchingFirstOccurrence){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                ans = mid;
                if(searchingFirstOccurrence){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
            else {
                if(target>nums[mid]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return ans;
    }
}
