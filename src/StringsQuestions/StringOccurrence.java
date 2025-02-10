package StringsQuestions;

public class StringOccurrence {
    public static void main(String[] args){
        String s = "AAABBCDDAABBCE";
        char[] ch = s.toCharArray();
        int n1 = ch.length;
        System.out.println("length via ch array: "+n1);
        int count = 1;
        for(int i=0;i<=n1-1;i++){
//            System.out.println(i);
            if(i==n1-1){
                if(ch[i]==ch[i-1]){
                    System.out.print(count + "" + ch[i] + " ");
                }
                else{
                    System.out.print(""+ch[i]+" ");
                }
            }else {
                if (ch[i] == ch[i + 1]) {
                    count++;
                } else {
                    if (count == 1) {
                        System.out.print("" + ch[i] + " ");
                    } else {
                        System.out.print(count + "" + ch[i] + " ");
                    }
                    count = 1;
                }
            }
        }
    }
}
