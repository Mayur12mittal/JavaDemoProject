package StringsQuestions;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s = "fdr#425@@5%%8*gh";
        String res = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(res);

        //separate all char by their types
        separateAllCharByType(s);
    }

    public static void separateAllCharByType(String s){
        String alphabets = "";
        String digits = "";
        String specialChars = "";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')){
                alphabets = alphabets + s.charAt(i);
            } else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
                digits = digits + s.charAt(i);
            }else {
                specialChars = specialChars + s.charAt(i);
            }
        }
        System.out.println(alphabets + " " +digits + " " +specialChars);
    }
}
