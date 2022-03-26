package Menu_Driven_Program;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class Ds_Operation_Array {
    static Scanner in = new Scanner(System.in);

    static int[] Array_input(int n) {
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    static void traversal(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void insert(int[] arr, int n){
        int i;
        System.out.println("Enter the element to be inserted");
        int x = in.nextInt();
        System.out.println("Enter the position");
        int pos = in.nextInt();
        int[] newarr = new int[n + 1];
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        System.out.println(Arrays.toString(newarr));
    }

    static void delection(int[] arr) {
        System.out.println("Enter the element to be deleted:");
        int target = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[i] = arr[i + 1];
                    i++;
                }
            }
            System.out.println(arr[i]);
        }
    }

    static void searching(int[] arr) {
        System.out.println("Enter the element to search:");
        int target = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(arr[i] + ", Location: " + i);
            }
        }
    }

    static void Updation(int[] arr) {
        System.out.println("Enter the item to be Update:");
        int item = in.nextInt();
        System.out.println("Enter the position:");
        int pos = in.nextInt();
        arr[pos - 1] = item;
        System.out.println(Arrays.toString(arr));
    }

    static int[] sorting(int[] arr) {
        if (arr.length > 0) {
            Arrays.sort(arr);
        } else
            System.out.println("Array length is 0");
        return arr;
    }

    static void merging(int[] first_arr, int[] second_arr) {
        int fal = first_arr.length;
        int sal = second_arr.length;
        int[] result = new int[fal + sal];
        System.arraycopy(first_arr, 0, result, 0, fal);
        System.arraycopy(second_arr, 0, result, fal, sal);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args){

        while (true) {

            System.out.println("....$$Hello Guys Here Anand_techie presenting an Array Menu Driven program$$....");
            System.out.println("1. Traverse \n2. Insertion \n3. Delection \n4. Searching \n5. Updation \n6. Merging \n7. Sorting \n8. Exit");
            System.out.print("Enter Your Choice:");
            int choice = in.nextInt();

            switch (choice) {
                case 1:{
                    System.out.println("Enter the size of an array");
                    int n = in.nextInt();
                    traversal(Array_input(n));
                    break;
                }
                case 2: {
                    System.out.println("Enter the size of an array");
                    int n = in.nextInt();
                    insert(Array_input(n), n);
                    break;
                }
                case 3:{
                    System.out.println("Enter the size of an array");
                    int n = in.nextInt();
                    delection(Array_input(n));
                    break;
                }
                case 4:{
                    System.out.println("Enter the size of an array");
                    int n = in.nextInt();
                    searching(Array_input(n));
                    break;
                }
                case 5: {
                    System.out.println("Enter the size of an array");
                    int n = in.nextInt();
                    Updation(Array_input(n));
                    break;
                }
                case 6: {
                    System.out.println("Enter the size of an array");
                    int n = in.nextInt();
                    System.out.println("Enter the second array size");
                    int m = in.nextInt();
                    merging(Array_input(n), Array_input(m));
                    break;
                }
                case 7:{
                    System.out.println("Enter the size of an array");
                    int n = in.nextInt();
                    System.out.println(Arrays.toString(sorting(Array_input(n))));
                    break;
                }
                case 8:{
                    exit(1);
                }
                default:
                    System.out.println("Enter the valid choice");
            }


        }

    }
}
