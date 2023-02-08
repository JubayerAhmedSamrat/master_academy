public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.println(currNode.data + " -> ");
            currNode = currNode.next;
        }

    }
    public void deleteFirst() {
        if(head == null) {
            System.out.println("the list is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast() {
        if(head == null) {
            System.out.println("the list is empty");
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

    }

    public static void main(String args[    ]) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
        
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }
    
}
