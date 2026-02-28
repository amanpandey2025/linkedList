package TCS;

public class occurence {
    public static void main(String[] args) {

    }
    static void skip( String unprocessed , String processed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if (ch == 'a'){
            skip(processed,unprocessed.substring(1));
        }else
            skip(processed+ch,unprocessed.substring(1));
    }
}
