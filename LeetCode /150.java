class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> newstack = new Stack<Integer>();
        for(String s: tokens){
            if(s.equals("+")){
                int a = newstack.pop();
                int b = newstack.pop();
                newstack.push(b+a);
            }
            else if(s.equals("-")){
                int a = newstack.pop();
                int b = newstack.pop();
                newstack.push(b-a);
            }
            else if(s.equals("*")){
                int a = newstack.pop();
                int b = newstack.pop();
                newstack.push(a*b);
            }
            else if(s.equals("/")){
                int a = newstack.pop();
                int b = newstack.pop();
                newstack.push(b/a);
            }
            else{
                newstack.push(Integer.parseInt(s));
            }
        }
        return newstack.pop();
    }
}