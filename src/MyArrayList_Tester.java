import java.util.Scanner;
import java.util.ArrayList;
public class MyArrayList_Tester {

    public static void main (String[] args) {
        MyArrayList<Integer> MyList = new MyArrayList<>();
        MyList.add(7);
        MyList.add(3);
        MyList.add(2);
        MyList.add(9);
        MyList.add(15);
        MyList.add(72);
        MyList.add(1);

        System.out.println(MyList.getSize());
    }
}
