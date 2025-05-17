package Task;

public class adult_minor_senior_ternary_operator
{
    public static void main(String[] args) {
        int age=17;
        String result=(age>18)?(age>65?" I am a senior":"I am an adult"):"I am minor";
        System.out.println(result);
    }
}
