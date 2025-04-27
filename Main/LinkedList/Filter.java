package Main.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Filter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Node head1 = new Node(0); // Dummy head for even list
        Node head2 = new Node(0); // Dummy head for odd list
        Node temp1 = head1;
        Node temp2 = head2;

        // Separate even and odd numbers into two lists
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Node node = new Node(arr[i]);
                temp1.next = node;
                temp1 = node;
            } else {
                Node node = new Node(arr[i]);
                temp2.next = node;
                temp2 = node;
            }
        }

        // Concatenate the even and odd lists
        temp1.next = head2.next; // Skip the dummy node

        // Print the concatenated list
        Node current = head1.next; // Skip the dummy node
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }
}
