package lab7;

import java.util.LinkedList;
import static java.util.Collections.sort;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(2);
        System.out.println("Adding: "+ integerLinkedList);
        System.out.println(integerLinkedList.get(0));
        integerLinkedList.add(1);
        System.out.println(integerLinkedList);
        integerLinkedList.pop();
        System.out.println(integerLinkedList);
        integerLinkedList.clear();
        System.out.println(integerLinkedList);
    }
}
