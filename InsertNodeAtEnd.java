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

  private static Node insertAtEnd(Node head, int x){
        if (head == null){
            head = new Node(x);
            return head;
        }
        
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(x);
        temp.next = newNode;
        return head;       
    }

  public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = ConvertArrtoLL(arr);
        insertAtEnd(head, 6);
  }
}
