import java.util.Stack;

public class ValidParenthesis {
    public static boolean isMatchingParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(isOpeningChar(ch)){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
                else if (!(isCorresponding(stack.peek(),ch))) {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isCorresponding(char a, char b){
        if(a=='(' && b==')' || a=='{' && b=='}' || a=='[' && b==']'){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isOpeningChar(char c){
        if(c=='(' || c=='{' || c=='['){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        String s = "({[]})";
        boolean result = isMatchingParenthesis(s);
        if(result){
            System.out.println("Valid Parenthesis");
        }
        else {
            System.out.println("Not a Valid Parenthesis");
        }
    }
}
