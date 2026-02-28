package TCS;

public class address {
    public static void main(String[] args) {
        String s = "1.1.1.1.1";
        System.out.println(defIPAddress(s));

    }
    static  String defIPAddress(String addresss){
        return addresss.replace("." , "[.]");
    }
}
