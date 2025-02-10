package OutputQuestions;

class Base {
    public void print(){
        System.out.println("method of base class");
    }
}

class Child extends Base{
    public void print(){
        System.out.println("method of child class");
    }
}

class Main{

    public static void doPrint(Base o){
        o.print();
    }

    public static void main(String[] args) {
        Base x = new Base();
        Base y = new Child(); //Dynamic method dispatch or runtime polymorphism
        Child z = new Child();
        doPrint(x);
        doPrint(y);
        doPrint(z);
    }
}
