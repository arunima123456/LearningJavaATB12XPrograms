package Task;

public class smallest_three
{
    public static void main(String[] args) {

    int a=10;
    int b=20;
    int c=30;
    int small;
    small= (a < b) ? (a < c ? a : c) : (b <c ? b : c);
        System.out.println(small);


}
}


