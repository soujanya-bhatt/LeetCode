import java.util.*;

class Solution{
    public static void reverse(Queue<Integer> q, int k){
        Stack<Integer> s = new Stack<>();
        for(int i = 1;i<=k;i++){
            s.push(q.remove());
        }
        while(s.size()>0){
            q.offer(s.pop());
        }
        for(int j = 1;j<=q.size()-k;j++){
             q.offer(q.remove());
        }
        
        System.out.println(q);
        
        
    }
    public static void main(String[] args){
        
        Queue<Integer> q = new ArrayDeque<>();
        
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        
        int k = 3;
        
        reverse(q,k);
        
        
    }
}
