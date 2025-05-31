package Task;

public class vowels_string
{
    public static void main(String[] args) {
        String sentence="I am a QA Engineer";
        int vowels=0, constant=0;
        String toLowercaseSentence=sentence.toLowerCase();
        for(int i=0;i<toLowercaseSentence.length();i++)
        {
            char ch=toLowercaseSentence.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels++;
            } else if (((ch>='a' && ch<='z'))) {
                
                constant++;
            }
        }
        System.out.println(vowels);
        System.out.println(constant);

    }
}
