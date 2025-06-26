

class Node{
    int data;
    Node next;

    Node(int data1 , Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }

}

public class removeK {
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
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node removeK(Node head, int k){
        if(head == null) return null;
        if(k == 1){
            Node temp = head;
            head = head.next;
            return head;
        }
        // K is greater than 1
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(cnt == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            cnt++;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        Node head = convertArr2LL(arr);

        System.out.println("Original Array: ");
        printLL(head);

        head = removeK(head,2);

        System.out.println("The Updated Array: ");
        printLL(head);
    }
}
