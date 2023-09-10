class Node{
    long data;
    Node next;
}

class Solution{
    
    public static void removeHead(Node head){
        head = head.next;
        Node t = head;
        while(t != null){
            System.out.print(t.data+" ");
            t = t.next;
        }
    }
    
    public static void removeTail(Node head){
        
        if(head == null){
            return;
        }
        if(head.next == null){
            return;
        }
        Node t = head;
        while(t.next.next != null){
            t = t.next;
        }
        t.next = null;
        Node t1 = head;
        while(t1 != null){
            System.out.print(t1.data+" ");
            t1 = t1.next;
        }
    }
    
    public static void removeAtIndex (Node head, int index){
        if(head == null){
            return;
        }
        if(head.next == null && index == 0){
            head = null;
        }
        Node t1 = head;
        for(int i = 0;i<index-1;i++){
            t1 = t1.next;
        }
      
        t1.next = t1.next.next;
        Node t = head;
        while(t != null){
            System.out.print(t.data+" ");
            t = t.next;
        }
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
        
        removeHead(head);
        removeTail(head);
        removeAtIndex(head,2);
    }
}
