// Time Complexity	O(n)
// Space Complexity	O(n)
// Example Input	"3[a2[c]]"
// Output	"accaccacc"

package Assignment10;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
	    Stack<StringBuilder> stringStack = new Stack<>();
	    StringBuilder curr = new StringBuilder();
	    int num = 0;

	    for (char ch : s.toCharArray()) {
	        if (Character.isDigit(ch)) {
	            num = num * 10 + (ch - '0');
	        } else if (ch == '[') {
	            countStack.push(num);
	            stringStack.push(curr);
	            curr = new StringBuilder();
	            num = 0;
	        } else if (ch == ']') {
	        	
	            int count = countStack.pop();
	            StringBuilder temp = stringStack.pop();
	            while (count-- > 0) {
	                temp.append(curr);
	            }
	            curr = temp;
	        } else {
	            curr.append(ch);
	        }
	    }
	    return curr.toString();
    }
}
