package StringsQuestions;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] arr = {"clutch","clove","cluster"};
        if(arr.length==0){
            System.out.println("Empty Array");
        }
        else {
            Arrays.sort(arr);

            char[] first = arr[0].toCharArray();
            char[] last = arr[arr.length - 1].toCharArray();

            System.out.println(Arrays.toString(first));
            System.out.println(Arrays.toString(last));

            for (int i = 0; i < first.length; i++) {
                if (first[i] == last[i]) {
                    sb.append(first[i]);
                } else {
                    break;
                }
            }
            System.out.println(sb);
        }
    }
}
