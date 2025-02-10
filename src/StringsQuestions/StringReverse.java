package StringsQuestions;

public class StringReverse {
    public static void main(String[] args) {
        String s = "mommy";
        //1st way
        reverseCall(s);

        //2nd way
        reverseString(s);
    }

    public static void reverseCall(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void reverseString(String str){
        String rev = "";
        char[] ch = str.toCharArray();
        for (char c : ch) {
            rev = c + rev;
        }
        System.out.println(rev);

        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
