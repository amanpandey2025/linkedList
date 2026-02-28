package TCS;

public class last {
    public static void main(String[] args) {

    }
    static int lengthOfLastWord(String s ){
        int length = 0;
        int size = s.length()-1;
        //skip  the space from the last
        while (size>=0 && s.charAt(size) == ' '){
            size--;
        }
        // count until you get space
        while (size>=0 && s.charAt(size)!= ' '){
            length++;
            size--;
        }
        return length;
    }

}
