package Methodoverloading;

public class M_loading {
    public static void main(String[] args) {

        MathOperation m1 = new MathOperation();
        int r = m1.add(3, 4);
        System.out.println(r);


        m1.add(3.4, 5, 6);
    }
    }
