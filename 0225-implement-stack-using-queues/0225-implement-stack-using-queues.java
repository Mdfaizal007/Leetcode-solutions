 import java.util.Queue;
 import java.util.LinkedList;

 class MyStack {
    Queue<Integer> q = new LinkedList<>();


    public MyStack() {
    

        
    }
    
    public void push(int x) {
         q.add(x);
         int s = q.size();
         for( int i=0; i<s-1; i++){
            q.add(q.remove());
         }
        
    }
    
    public int pop() {
         int r = q.remove();
         return r;
        
    }
    
    public int top() {
        int t =q.peek();
        return t;
        
    }
    
    public boolean empty() {
        boolean m = q.isEmpty();
        return m;

        
    }
}