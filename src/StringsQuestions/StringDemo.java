package StringsQuestions;

public class StringDemo {

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("raceacar");
        //sb.append("mon");
        System.out.println(sb);
        StringBuilder rev = new StringBuilder(sb.reverse());
        //rev = sb.reverse();
        System.out.println(rev);
        if(sb.compareTo(rev) == 0){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
