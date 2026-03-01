package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class nosizeGiven {
    public static void main(String[] args) {

    }
    static int GCD(int a ,int b){
        if (b==0){
            return a;
        }
        return GCD(b,a%b);
    }
}


