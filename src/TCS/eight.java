package TCS;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] pairs = line.split(" ");
        int[] arr = new int[pairs.length];
        for (int i = 0; i < pairs.length ; i++) {
            arr[i] = Integer.parseInt(pairs[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

}
