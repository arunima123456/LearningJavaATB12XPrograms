package static_exm;

public class static_block

{
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {
    static {
        System.out.println("Called only Once when Class is loaded");
        System.out.println("You can write a code reading a excel, file, , database file");
    }

    static int a = 10;

    static void m1() {
        System.out.println("static functionc");
    }
}
