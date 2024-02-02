package arkXacademy.Day9.C5;
import java.util.*;
public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedList<String> Grocery =new LinkedList<>();
        Grocery.add("Pasta");
        Grocery.add("Orange");
        Grocery.add("Tea");

        Grocery.add(0, "Egg");
        Grocery.remove(1);
        int length = Grocery.size();
        System.out.println("Length of the linked list: " + length);
        for(String a :  Grocery)
            System.out.println(a);
        Collections.reverse(Grocery);
        System.out.println(Grocery);
    }
}
