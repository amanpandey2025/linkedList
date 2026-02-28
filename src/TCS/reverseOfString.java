package TCS;

import java.util.Scanner;

public class reverseOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of char ");
        int size = input.nextInt();
        input.nextLine();
        char[] chars = new char[size];
        System.out.println("enter the "+size+" characters ");
        for (int i = 0; i < size; i++) {
            chars[i] = input.next().charAt(0);
        }
        reverChar(chars);

    }
    static void reverChar(char[] arr){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
