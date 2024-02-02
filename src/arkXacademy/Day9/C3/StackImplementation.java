package arkXacademy.Day9.C3;
import java.util.*;
public class StackImplementation {
    public static void main(String[] args) {
        Stack<String> classmate =new Stack<>();
        classmate.push("Sara");
        classmate.push("Nora");
        classmate.push("Reda");
        classmate.peek(); //get the element at the top of stack = last element added
        System.out.println("peek :"  + classmate.peek());
        classmate.pop();

        for( String str : classmate){
            System.out.println(str);
        }


    }
}
