package TCS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class subset {
    public static void main(String[] args) {
        solution("","abc");
        permutations("","abc");


    }
    static void solution(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.print(Arrays.toString(processed.toCharArray()));
            return;
        }
        char ch = unprocessed.charAt(0);
        solution(processed+ch,unprocessed.substring(1));
        solution(processed,unprocessed.substring(1));
    }
    static void permutations(String processed,String unprocessed){
        if (processed.isEmpty()){
            System.out.println(Arrays.toString(processed.toCharArray()));
            return;
        }
        char ch = unprocessed.charAt(0);

        for (int i = 0; i <processed.length() ; i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i,processed.length());
            permutations(first+ch+second,unprocessed.substring(1));
        }
    }
}
