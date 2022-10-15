interface A {
    static void test() {
        System.out.println("A");
    }
}

interface B {
    static void test() {
        System.out.println("B");
    }
}

public class MultipleInterfaces implements A, B {
    public void test() {
        A.test();
        B.test();
    }

    public static void main(String[] args) {
        MultipleInterfaces m1 = new MultipleInterfaces();
        m1.test();
    }
}
