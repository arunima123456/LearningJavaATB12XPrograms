package Methodoverloading;

public class MathOperation {


    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, int b, int c) {
        return a + b + c;
    }

}