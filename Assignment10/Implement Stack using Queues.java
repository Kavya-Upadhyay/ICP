// Overall Time Complexity: O(n) 
//  Space Complexity: O(n)

// Test case:
// Input
// ["MyStack", "push", "push", "top", "pop", "empty"]
// [[], [1], [2], [], [], []]
// Output
// [null, null, null, 2, 2, false]


package Assignment10;

public class Implement Stack using Queues {
    
}

class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    public void push(int x) {
        q.add(x);
        for(int i=1;i<q.size();i++) q.add(q.remove());
    }  
    public int pop() {
        return q.remove();
    } 
    public int top() {
        return q.element();
    }  
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
