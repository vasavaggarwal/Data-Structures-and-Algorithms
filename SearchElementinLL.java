class Node{
    int data;
    Node next;

    Node(int data, Node next1){
        this.data = data;
        this.next = next1;
    }

    Node (int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private static Node ConvertArrtoLL(int arr[]){
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i<arr.length; i++){
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

    private static int sizeOfLinkedList(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    private static boolean searchKey(int n, Node head, int key){
        Node temp = head;
        while (temp!=null){
            if (temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = ConvertArrtoLL(arr);
        int size = sizeOfLinkedList(head);
        System.out.println("Element found status: "+searchKey(size, head, 4));
        
    }
}

