package TCS;

public class parser {
    public static void main(String[] args) {
        String s = "G()(al)";
        System.out.println(ok(s));

    }
    static String ok(String commands ){
        return commands.replace("()","o").replace("(al)","al").replace("G","g");
    }
}
