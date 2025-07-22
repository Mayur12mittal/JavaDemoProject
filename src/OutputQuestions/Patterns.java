package OutputQuestions;

public class Patterns {
    public static void main(String[] args) {
       // pattern1();
       // pattern2();
        pattern3();
    }

    public static void pattern1(){
//        ****
//        ***
//        **
//        *
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(){
//        1
//        12
//        123
//        1234
//        12345
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern3(){
//        *
//        * *
//        * * *
//        * * * *
//        * * *
//        * *
//        *
        int maxCol = 4;
        for(int i=1;i<=(2*maxCol)-1;i++){
            if(i<=maxCol){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                for(int j=1;j<=(2*maxCol)-i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }


}
