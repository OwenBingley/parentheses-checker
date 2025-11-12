// Class author: Owen Bingley
// Date created: 11/9/2025
// General description: This class checks a String to see if all
// parentheses, brackets, and braces are opened and closed correctly.
//
public class ParenthesisChecker {

    
    // Pre-condition: cant be null
    
    // Post-condition: 
    
    public static boolean isValid(String s) {
        
        java.util.Stack<Character> stack = new java.util.Stack<>();

       
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
           
            else if (c == ')' || c == '}' || c == ']') {

               
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }

        
        return stack.isEmpty(); // returns true if stack is empty
    }


    
    // Pre-condition:
    // Post-condition: 
    
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]")); //true
System.out.println(isValid("(]")); //false
System.out.println(isValid("([{({})}])")); //true
System.out.println(isValid("(([]){})")); //true
System.out.println(isValid("{}[())()(]")); //false
System.out.println(isValid("(){}{")); //false

System.out.println(isValid("([)]")); //false
System.out.println(isValid("([{}([)])]")); //false
    }
}