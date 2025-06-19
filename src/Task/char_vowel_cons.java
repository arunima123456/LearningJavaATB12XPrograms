package Task;

public class char_vowel_cons
{
    public static void main(String[] args) {
        char c='A';
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println("vowel");
        }
        else {
            System.out.println("constant");
        }

    }
}
