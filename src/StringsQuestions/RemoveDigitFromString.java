package StringsQuestions;

import java.util.Scanner;

public class RemoveDigitFromString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        removeWay1(s);

        removeWay2(s);

        removeWay3(s);
    }

    public static void removeWay1(String s){
        char[] str = s.toCharArray();
        String result="";
        for(char c: str){
            if(!Character.isDigit(c)){
                result = result + c;
            }
        }
        System.out.println(result);
    }

    public static void removeWay2(String s){
        s = s.replaceAll("\\d","");
        System.out.println(s);
    }

    public static void removeWay3(String s){
        s = s.replaceAll("[0-9]","");
        System.out.println(s);
    }

}
