package TCS;

import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+"elements ");
        for (int i = 0; i <n ; i++) {
            arr[i] = input.nextInt();

        }
        //output of the array
        System.out.println("the elements in array are :");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
