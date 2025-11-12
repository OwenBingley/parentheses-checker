// Class author: Owen Bingley
// Date created: 11/9/2025
// General description: This class checks a String to see if all
// parentheses, brackets, and braces are opened and closed correctly.

public class ParenthesisChecker {

    
    // Pre-condition: cant be null. 
    
    // Post-condition: if the string is true or false for the parentheses, brackets, and braces being opened and closed correctly.
    
    public static boolean isValid(String s) {
        
        java.util.Stack<Character> stack = new java.util.Stack<>();

       
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the character is an opening parenthesis, push it onto the stack.
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
           
            else if (c == ')' || c == '}' || c == ']') {

               // If the stack is empty, there is no matching opening parenthesis for the closing parenthesis.
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check if the closing parenthesis matches the opening parenthesis.
                if (c == ')' && top != '(') {
                    return false;
                }
                // Check if the closing brace matches the opening brace.
                if (c == '}' && top != '{') {
                    return false;
                }
                // Check if the closing bracket matches the opening bracket.
                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }

        
        return stack.isEmpty(); // returns true if stack is empty
    }


    
    // Pre-condition: the is valid method witch runs the statments do figure out if the string is true or false.
    // Post-condition: pints out true of false for the following strings.
    
    // Test cases for the isValid method
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