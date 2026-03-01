package TCS;

public class ook {
    public static void main(String[] args) {

    }
    static void first(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if (ch!='a'){
                stringBuilder.append(ch);

            }

        }
          System.out.println(stringBuilder.toString());

    }
}
