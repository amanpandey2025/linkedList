package TCS;

public class third {
    public static void main(String[] args) {

    }
    static int reverse(int n){
        int result = 0;
        while (n != 0){
            int remainder = n % 10;// here we will find the last digit of the number;
            result = result * 10 + remainder;
            n = n /10;

        }
        return result;
    }
}
