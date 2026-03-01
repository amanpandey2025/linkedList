package TCS;

import java.util.Scanner;

public class questionSolution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();//string me input
        int starCount =0;
        int hashCount = 0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == '*'){
                starCount++;
            }else if (str.charAt(i) == '#'){
                hashCount++;
            }
        }
        System.out.println(starCount - hashCount);
    }
}
