package Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        normalTree tree = new normalTree();
        tree.populate(scanner);
        tree.display();
    }
}
