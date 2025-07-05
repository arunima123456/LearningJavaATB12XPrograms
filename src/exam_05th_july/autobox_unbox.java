package exam_05th_july;

public class autobox_unbox
{
    public static void main(String[] args) {
        byte b = 100; //Primitive byte data
        Byte B = b; //Auto-Boxing of byte data
        System.out.println(B);

        short s = 100; //Primitive short data
        Short S = s;   //Auto-Boxing of short data
        System.out.println(S);

        int i = 200;    //Primitive int Data
        Integer I = i;  //Auto-Boxing of int data
        System.out.println(I);
        Integer anotherBoxed = 200;
        int unboxedNum = anotherBoxed; // Automatically unboxed

        System.out.println("Unboxing int: " + unboxedNum);
    }

    }

