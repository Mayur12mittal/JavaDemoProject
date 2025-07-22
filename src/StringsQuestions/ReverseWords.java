package StringsQuestions;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Mayur Mittal";
        String[] words = str.split(" ");
        String revString = "";

        for(String word : words){
            String revWord = "";
            for(int i=0;i<word.length();i++){
                revWord = word.charAt(i) + revWord;
            }
            revString =  revString + revWord + " ";
        }
        System.out.println(revString);
    }
}
