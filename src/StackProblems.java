import java.util.HashMap;
import java.util.Stack;

public class StackProblems {
    public static boolean isValidParentheses(String s){
        if(s.length()%2!=0){
            return false;
        }
        Stack<String> mystack = new Stack<>();
        HashMap<String,String> matching = new HashMap<>();
        matching.put(")","(");
        matching.put("]","[");
        matching.put("}","{");
        for(int i=0;i<s.length();i++){
            String current = String.valueOf(s.charAt(i));
            if (matching.containsValue(current)) {
                mystack.push(current);
            }
            else if (matching.containsKey(current)) {
                if (mystack.isEmpty()) {
                    return false;
                }
                if (!mystack.peek().equals(matching.get(current))) {
                    return false;
                }
                mystack.pop();
            }
        }
        return mystack.isEmpty();
    }
}
