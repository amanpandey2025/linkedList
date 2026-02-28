package TCS;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ");
        int num  = input.nextInt();
        System.out.println("enter the number you want to find");
        int find = input.nextInt();
        int result = occur(num,find);
    }
    static int occur(int number,int find){
        int count = 0;
        while(number>0){
            long digit = number % 10;
            if (digit == find){
                count++;
            }
            number = number/10;
        }
        return count;
    }
}
