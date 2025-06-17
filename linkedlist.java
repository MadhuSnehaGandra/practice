class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList {
    Node head;

    // Add node at end
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Display the list
    void display() {
        Node current = head;
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class CustomLinkedListExample {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.display();
    }
}
