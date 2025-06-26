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

public class deleteHead{
    // Print all the elemet in the list

    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
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

        public static Node deleteHead(Node head){
            Node temp = head;
            head = head.next;
            return head;
        }
    

    public static void main(String[] args) {
        int[] arr = {12,5,8,7,4};
        Node head = convertArr2LL(arr);
        
        System.out.println("Original List : ");
        printLL(head);

        head = deleteHead(head);

        System.out.println("After deleting the head element:");
        printLL(head);

        
    }
}