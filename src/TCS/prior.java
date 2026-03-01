package TCS;

import java.util.Scanner;

public class prior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr =  new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = input.nextInt();
        }
        // yaha tak input le leya he
        int count =1;
        int maxSoFar= arr[0];
        for (int i = 0; i <n ; i++) {
            if (arr[i]>maxSoFar){
                count++;
                maxSoFar = arr[i];
            }
        }
        System.out.println(count);

    }
}
