import java.util.Scanner;
import java.util.LinkedList;
public class MyLinkedList_Tester {
    public static void main(String[] args) {
        MyLinkedList<String> MyList = new MyLinkedList<>();
        MyList.add("I am");
        MyList.add("already");
        MyList.add("tired bc of ADS :<");


        for (int i = 0; i < MyList.getSize(); i++)
            System.out.println(MyList.get(i) + " ");
    }
}


