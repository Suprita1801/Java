// package LinkedList;
class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
        
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class deleteTail {
    // Printing all elements in the linked List

    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println(" ");
    }

    public static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1 ; i < arr.length ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
  
    
    public static void main(String[] args) {
        int[] arr = {12,13,2,4,5};
        Node head = convertArr2LL(arr);

        System.out.println("Original Array: ");
        printLL(head);

        head = deleteTail(head);

        System.out.println("Array after deleting the tail elemet : ");
        printLL(head);
    }
}
