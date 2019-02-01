class A{
    int a;

    void print(){
        System.out.println(a);
    }
}

class B extends A{
    int b;

    void print(){
        System.out.println(b);
    }
}

public class temp {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        a1.a = 100;
        b1.b = 200;

        a1.print();
        b1.print();
    }
}
