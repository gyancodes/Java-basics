package Menu_Driven_Program;

import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.exit;

public class Ds_operation_Stack {
    static Stack<Integer> stack = new Stack<>();

    static void push_item(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the item:");
        int n = in.nextInt();
        stack.push(n);
        System.out.println("Item entered is:" + n);
    }

    static void pop_item(){
        if(stack.size()==0){
            System.out.println("Stack is Empty");
        }else {

            System.out.println("Item deleted is:" + stack.pop());
        }
    }

    static void traverseItem(){
        if(stack.size()==0){
            System.out.println("Stack is empty");
        }
        else{
            for (int i = 0; i < stack.size() ; i++) {
                System.out.println(stack.get(i) + " ");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("""
                        1.Push
                        2.Pop
                        3.Traverse
                        4.Exit""".indent(1));
                System.out.print("Enter the choice:");
                int choice = in.nextInt();
                switch (choice) {
                    case 1 -> push_item();
                    case 2 -> pop_item();
                    case 3 -> traverseItem();
                    case 4 -> exit(1);
                    default -> System.out.println("Enter the valid choice!...");
                }
            }
        }
    }
}
