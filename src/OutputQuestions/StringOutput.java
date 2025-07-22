package OutputQuestions;

public class StringOutput {
    public static void main(String[] args) {
        String s = "";
        String s1 = "";
        for(int i=0;i<5;i++){
            char ch = (char) ('a' + i);
            s = s + ch;
            s1 = ch + s1;
        }
        System.out.println(s);
        System.out.println(s1); //reverse of string
    }
}

