package TCS;

public class fifth {
    public static void main(String[] args) {
        int number = 212;


    }
    static boolean check(int number){
        if (number<=0) return false;
        int original = number;
        int reverse = 0;

        while (number!=0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number/10;
        }
        return original ==  reverse;
    }
}
