package stringbuffer;

public class lab03_buffer
{
    public static void main(String[] args) {
        // String - 90%
        String s0 = "Pramod";
        String s1 = new String("Pramod");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuilder stringBuilder = new StringBuilder("Pramod");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());





    }
}
