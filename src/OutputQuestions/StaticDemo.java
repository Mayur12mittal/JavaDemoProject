package OutputQuestions;

public class StaticDemo {

    static void show(){
        System.out.println("I m in static show function...");
    }

    public static void main(String[] args) {
        System.out.println("Main function...");
        show();
    }
}
