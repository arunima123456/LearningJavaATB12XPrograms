package stringbuffer;

public class Lab06_buffer
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text
        sb.reverse();
        System.out.println(sb);
    }
}
