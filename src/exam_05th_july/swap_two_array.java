package exam_05th_july;

import java.util.*;

public class swap_two_array
{
    public static void main(String[] args) {
        ArrayList<Integer> ArrList = new ArrayList<Integer>();
        ArrList.add(1);
        ArrList.add(2);
        ArrList.add(3);
        Collections.swap(ArrList,0,2);
        System.out.println("after swapping " + ArrList);

    }
}
