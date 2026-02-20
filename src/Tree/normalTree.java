package Tree;

import java.util.Scanner;

public class normalTree {
    public normalTree() {
    }

    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    private Node root;
    //now inserting the element
    public void populate(Scanner scanner){
        System.out.println("enter the root node :");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }
    private void populate(Scanner scanner,Node node){
        System.out.println("do you want to enter left of "+node.val);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("enter the value on the  left of "+node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("do you want to enter right of "+node.val);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("enter the value on the  right of "+node.val);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }

    }
    // function for display
    public void display() {
        display(root, "", true);
    }

    private void display(Node node, String indent, boolean isLast) {
        if (node == null) {
            return;
        }

        System.out.println(indent + (isLast ? "└── " : "├── ") + node.val);

        indent += isLast ? "    " : "│   ";

        display(node.left, indent, false);
        display(node.right, indent, true);
    }


}
