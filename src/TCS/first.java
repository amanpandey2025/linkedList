package TCS;

public class first {
    public static void main(String[] args) {

    }
    static int fibo(int number ){
        if (number == 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }
        return fibo(number-1) + fibo(number-2);
    }
}
