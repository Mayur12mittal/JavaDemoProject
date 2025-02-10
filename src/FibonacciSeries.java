import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int nextNum = 0;
       System.out.print(a + " " + b);
        for(int i=2;i<n;i++){
            nextNum = a+b;
            System.out.print(" "+nextNum+" ");
            a=b;
            b=nextNum;
        }
        System.out.println();
        System.out.println("The "+n+"th fibbonacci number is "+nextNum);

    }
}
