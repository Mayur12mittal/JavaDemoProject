package StringsQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        way1(); //using LinkedHashSet
        way2(); //using stream API and lambda expression
        way3(); //using indexOf method
    }

    public static void way1(){
        String s = "abcadbefeab"; //unique char - a, b, c, d, e, f
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        //System.out.println(set);
        for(char c : set){
            sb.append(c);
        }
        System.out.println(sb);
    }

    //using streamAPI
    public static void way2(){
        String s = "abcadbefeab";

        //method 1 of implementing by first putting string as list<char>
        String res = Arrays.asList(s.split("")).stream().distinct().collect(Collectors.joining());
        System.out.println(res);

        //method 2 of implementing using lambda expression
        StringBuilder sb = new StringBuilder();
        s.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb);
    }

    //using indexOf method
    public static void way3(){
        String s = "abcadbefeab";
        String result = "";
        for(int i=0;i<s.length();i++){
            if(result.indexOf(s.charAt(i))<0){
                result = result + s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
