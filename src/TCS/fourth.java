package TCS;

public class fourth {
    public static void main(String[] args) {

    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int count = 2;
        while (count * count <= number) {
            if (number % count == 0) {
                return false;
            }
            count++;
        }
        return true;
    }
}
