class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        boolean ans = true;
        if(s.length() == 1){
            ans = false;
        } else{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '(' || 
                s.charAt(i) == '[' ||
                s.charAt(i) == '{'){
                    stack.push(s.charAt(i));
                } else {
                    if(stack.size() != 0 && ((s.charAt(i) == ')' && stack.peek() == '(')||
                    (s.charAt(i) == ']' && stack.peek() == '[')||
                    (s.charAt(i) == '}' && stack.peek() == '{'))){
                        stack.pop();
                    } else{
                        ans = false;
                        break;
                    }
                }
            }
            if(stack.size() > 0){
                ans = false;
            }
        }
        return ans;
    }
}
