class Node{
    long data;
    Node next;
}

class Solution{
    
    public static void addElementAtIndex(Node head, int index){
        
        Node newNode = new Node();
        newNode.data = 60;
        Node temp = head;
        int count = 0;
        if(head == null){
            //addElementAtHead(newNode);
        } else {
            while(temp.next != null){
                count++;
                if(count == index){
                    break;
                }
                temp = temp.next;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
        
        Node temp1 = head;
        while(temp1!=null){
            System.out.println(temp1.data);
            temp1 = temp1.next;
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
        
        addElementAtIndex(head, 1);
    }
}
