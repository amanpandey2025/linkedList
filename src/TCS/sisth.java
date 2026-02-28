package TCS;

public class sisth {
    public static void main(String[] args) {

    }
    static int fact(int n){
        if (n==0|| n ==1){
            return 1;
        }
        return n * fact(n-1);
    }
    static boolean isStrong(int n){
        int original = n;
        int sum = 0;
        while (n!= 0){
            int digit = n%10;
            sum = sum +fact(digit);
            n = n/10;
        }
        return sum == original;
    }
}
