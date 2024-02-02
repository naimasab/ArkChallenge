package arkXacademy.Day9.C4;
import java.util.*;
public class QueueImplementation {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("Nora");
        q.add("Nor");
        q.add("Rim");
        q.add("Ashraf");
        q.add("Leila");
        System.out.println("Removed element: "+q.remove());
        System.out.println(("element at the front of the queue : " + q.peek()));
        System.out.println("checking if the q is empty :" );

        for( String str : q){
            System.out.println(str);
        }


    }
}
