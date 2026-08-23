package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList(Node n) {
        this.head = n;
    }

    LinkedList() {

    }

    public void insertAtBeginning(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int x) {
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;

        while(curr.next!=null){
            curr = curr.next;
        }

        curr.next = newNode;

    }

    public void traverse() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }

     public void insertAtPosition(int pos, int x){
            // check if there is no node so insertAtBeginning

            if(pos==0){
                insertAtBeginning(x);
                return;
            }
            
            Node newNode = new Node(x);
            Node curr = head;
            for(int i=0;i<pos-1;i++){
                
                if(curr==null){
                    System.out.println("Nhi ho paayega insert");
                      return;
                }
                curr = curr.next;
            
            }
            

            curr.next = newNode.next;
            curr.next = newNode;

     }

}

public class Creation {

    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.insertAtBeginning(40);
        l.insertAtBeginning(30);
        // l.insertAtBeginning(20);
        // l.insertAtBeginning(10);

        l.insertAtEnd(100);
        l.insertAtPosition(10, 500);

        l.traverse();

    }

}
