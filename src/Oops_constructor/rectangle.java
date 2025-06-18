package Oops_constructor;

public class rectangle {
    int length;
    int width;
    private boolean shape;
    //private int areaDisplay;

    public rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int shape() {

        return length * width;

    }

    class shape {
        public static void main(String args[]) {
            rectangle r1 = new rectangle(4, 5);
            System.out.println(r1.shape);
        }
    }
}


