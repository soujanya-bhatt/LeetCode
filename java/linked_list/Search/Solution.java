class Node{
    long data;
    Node next;
}

class Solution{
    public static void search(Node head, int val){
        Node t = head;
        boolean b = false;
        while(t.next!= null){
            if(t.data== val){
                b = true;
                break;
            } else{
                t = t.next;
            }
        }
        System.out.println(b);
    }
    
    public static void minOfLinkedlist(Node head){
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String[] args){
        
        Node n2 = new Node();
        n2.data = 30;
        
        Node n3 = new Node();
        n3.data = 15;
        n3.next = n2;

        Node n1 = new Node();
        n1.data = 20;
        n1.next = n3;
        
        Node head = new Node();
        head.data = 10;
        head.next = n1;

        search(head,10);
        minOfLinkedlist(head);
    }
}
