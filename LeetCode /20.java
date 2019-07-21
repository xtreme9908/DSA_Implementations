class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] ss = s.toCharArray();
        int m=0;
	    for (int i = 0; i < ss.length; i++) {
		    if (ss[i] == '(' || ss[i] == '{' || ss[i] =='[') {
			    stack.push(ss[i]);
            }
            else{
                if(ss[i] == ')'){
                    if(stack.empty() || stack.peek() !='('){
                        return false;
                    }
                    stack.pop();
                }
                else if(ss[i] == '}'){
                    if(stack.empty() || stack.peek() != '{'){
                        return false;
                    }
                    stack.pop();
                }
                else if(ss[i] == ']'){
                    if(stack.empty() || stack.peek()!= '[' ){
                        return false;
                    }
                    stack.pop();
                }
            }
        }
         if(stack.empty()){
            return true;
        }
        else{
        return false;
        }
    }
   
}

