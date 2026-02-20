package DoublyLinkedList;

public class dll {
    private Node head;

    public void inserFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head!=null){
            head.prev = node;
        }
        head = node ;
    }
    public void inerstLast(int val){
        Node node = new Node(val);
        Node last = head ;
        while (last.next != null){
            last = last.next;
        }
    }
    public void display(){
        Node node = head;
        Node last = null;
        while (node!=null){
            System.out.print(node.val +"->");
            last = node ;
            node = node.next;
        }
        System.out.println("end");
        System.out.println("print in reverse !");
        while (last!=null){
            System.out.print(last.val + "<-");
            last = last.prev;
        }
        System.out.println();
    }

    class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
