package stringbuffer;

public class Lab07_buffer
{
    public static void main(String[] args) {


    StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
//        sb.delete(5,16); // Delete the substring
//        System.out.println(sb);

        sb.replace(0, 4, "C++");
        System.out.println(sb);

}
}
