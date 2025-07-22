package OutputQuestions;

public class FibonacciNumber {
    public static void main(String[] args) {
        //printFibonacciNum();
        System.out.println(printViaRecursion(6));
    }

    public static void printFibonacciNum(){
        int a = 0;
        int b = 1;
        System.out.print(a+ " " +b);
        for(int i=2;i<10;i++){
            int currSum = a+b;
            System.out.print(" "+currSum);
            a=b;
            b=currSum;
        }
    }

    static int printViaRecursion(int n){
        if(n<2){
            return n;
        }
        return printViaRecursion(n-1)+printViaRecursion(n-2);
    }
}
