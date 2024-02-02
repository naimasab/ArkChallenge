package arkXacademy.Day9.C2;

import java.util.ArrayList;
import java.util.Iterator;

public class ListManipulation {
    public static void main(String[] args) {
        ArrayList<String> fruit =new ArrayList<>();

        fruit.add("strawberry");
        fruit.add("lemon");
        fruit.add("apple");
        fruit.add("peach");
        fruit.remove(2);
        System.out.println(fruit.get(2));

        if (fruit.contains("strawberry")){
            System.out.println("This element exist.");
        }
            else {
                System.out.println("This element doesn't exist.");
        }

        Iterator <String>it=fruit.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
            /* another way

            for(String str :fruit){

                System.out.println(str);
             */
            }
    }

