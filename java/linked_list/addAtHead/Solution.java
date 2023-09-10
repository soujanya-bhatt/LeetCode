class Node{
    long data;
    Node next;
}

class Solution{
    public static void addElementAtHead(Node head){
        
        Node newNode = new Node();
        newNode.data = 60;
        newNode.next = head;
        head = newNode;
        
       Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
   
    public static void main(String[] args){
        
        Node n2 = new Node();
        n2.data = 30;

        Node n1 = new Node();
        n1.data = 20;
        n1.next = n2;
        
        Node head = new Node();
        head.data = 10;
        head.next = n1;
      
        addElementAtHead(head);
    }
}
