// Time Complexity	O(n)
// Space Complexity	O(n)
// Example Input: "deeedbbcccbdaa", k=3
// Output: "aa"                              |



package Assignment10;

class Solution {
    public class Node{
        int occurance;
        char character;
        public Node(char c){
            character=c;
            occurance=1;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Node> stk=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stk.isEmpty()&&stk.peek().character==c){
                stk.peek().occurance+=1;
                if(stk.peek().occurance==k){
                    stk.pop();
                }
            }
            else
                stk.push(new Node(c));
        }
        StringBuilder str=new StringBuilder();
        while(!stk.isEmpty()){
            int times=stk.peek().occurance;
            char ch=stk.pop().character;
            for(int i=0;i<times;i++)
                str.append(ch);
        }
        str.reverse();
        return str.toString();
    }
}
