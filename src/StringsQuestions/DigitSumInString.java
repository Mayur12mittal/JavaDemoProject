package StringsQuestions;

import java.util.Scanner;

public class DigitSumInString {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();

        char[] str = s.toCharArray();
        int sum = 0;
        for(char c: str){
            if(Character.isDigit(c)){
                sum = sum + Integer.parseInt(String.valueOf(c));
               // sum = sum + Integer.parseInt(""+c);
            }
        }
        System.out.println(sum);
    }
}
