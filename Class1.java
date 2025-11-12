//  Class author:  Owen Bingley
//  Date created:  11/10/25
//  General description: 

public class Class1 {

public static void main(String[] args){


System.out.println(isValid("(){}[]")); //true
//System.out.println(isValid("(]")); //false
//System.out.println(isValid("([{({})}])")); //true
//System.out.println(isValid("(([]){})")); //true
//System.out.println(isValid("{}[())()(]")); //false
//System.out.println(isValid("(){}{")); //false
//---------------------------------
//Tricky!:
//System.out.println(isValid("([)]")); //false
//System.out.println(isValid("([{}([)])]")); //false    

}


public static boolean isValid(String s)
{

    //System.out.println(s);  
//String s0 = s.substring(0,1);   // makes the code much more complicated
//String s1 = s.substring (1 , s.length());


//"[()()()[]{}]{]}"
   // System.out.println(s0); 
    //  System.out.println(s1); 

    //Do work to check string
 //if (s.length() == 0){
   //  return true;
 }

if(s0 == ")" || s0 == "}" || s0 == "]"){
    return false;
}

    for(int i = 0; i < s1.length(); i++){
        if (s0 == "(" && s1.charAt(i) == ')'){
            s1= s1.substring(0, s1.indexOf(")")-1)+s1.substring(s1.indexOf(")")+1);
            s1.replaceFirst(")", "");
            System.out.println(s1);
isValid(s1);


        } else if (s0 == "{" && s1.charAt(i) == '}'){
            s1= s1.substring(0, s1.indexOf("}")-1)+s1.substring(s1.indexOf("}")+1);
            s1.replaceFirst("}", "");
            System.out.println(s1);
            isValid(s1);


        } else if (s0 == "[" && s1.charAt(i) == ']'){
s1.replaceFirst("]", "");
            System.out.println(s1);
isValid(s1);


        } 
    }
return false;
}









}